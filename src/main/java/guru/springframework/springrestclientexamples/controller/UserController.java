package guru.springframework.springrestclientexamples.controller;

import guru.springframework.springrestclientexamples.service.ApiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

@Slf4j
@Controller
@AllArgsConstructor
public class UserController {
    private ApiService apiService;

    @GetMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange) {
        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();

        Integer limit = Integer.valueOf(map.get("limit").get(0));

        log.debug("Received limit value of " + limit);

        if (limit == null || limit == 0) {
            log.debug("Setting limit to a default of 10");
            limit = 10;
        }

        model.addAttribute("users", apiService.getUsers(limit));

        return "userlist";
    }
}
