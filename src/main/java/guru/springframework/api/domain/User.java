package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Email;

@Data
@RequiredArgsConstructor
public class User {
    private final String gender;
    private final Name name;
    private final Location location;

    @Email
    private final String email;

    private final Login login;

    private final String phone;
    private final Job job;
    private final Billing billing;
    private final String language;
    private final String currency;
}
