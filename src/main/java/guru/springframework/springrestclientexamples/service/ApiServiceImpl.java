package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("https://private-anon-b9cf8a53f0-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);

        return userData.getData();
    }
}
