package guru.springframework.springrestclientexamples.controller;

import guru.springframework.springrestclientexamples.service.ApiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

import static org.apache.logging.log4j.util.Strings.isBlank;

@Slf4j
@Controller
@AllArgsConstructor
public class UserController {
    private ApiService apiService;

    @GetMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }

//    @PostMapping("/users")
//    public String formPost(Model model, ServerWebExchange serverWebExchange) {
//        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
//
//        Integer limit = Integer.valueOf(map.get("limit").get(0));
//
//        log.debug("Received limit value of " + limit);
//
//        if (limit == null || limit == 0) {
//            log.debug("Setting limit to a default of 10");
//            limit = 10;
//        }
//
//        model.addAttribute("users", apiService.getUsers(limit));
//
//        return "userlist";
//    }

//    @PostMapping("/users")
//    public String formPost(ServerWebExchange exchange, Model model) {
//
//        exchange.getFormData().subscribe(map -> {
//            String limit = map.getFirst("limit");
//
//            log.debug("Received limit: [" + limit + "]");
//            if(isBlank(limit)) {
//                limit = "10";
//            }
//
//            model.addAttribute("users", apiService.getUsers(Integer.valueOf(limit)));
//        });
//
//        return "userlist";
//    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange webExchange) {
        model.addAttribute("users",
                apiService.getUsers(webExchange
                        .getFormData()
                        .map(data -> {
                            String limitInput = data.getFirst("limit");
                            log.debug("Received Limit value: " + limitInput);
                            int limit;
                            try {
                                assert limitInput != null;
                                limit = Integer.parseInt(limitInput);
                            } catch (NumberFormatException e) {
                                limit = 0;
                            }

                            //default if zero
                            if (limit == 0) {
                                log.debug("Setting limit to default of 10");
                                limit = 10;
                            }

                            return limit;
                        })));

        return "userList";
    }
}
