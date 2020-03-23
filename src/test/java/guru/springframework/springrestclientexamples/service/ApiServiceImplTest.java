package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
    @Autowired private ApiService apiService;

    @Before
    public void setUp() {
        
    }

    @Test
    public void getUsers() {
        List<User> users = apiService.getUsers(1);

        assertThat(users.size(), is(1));
    }
}