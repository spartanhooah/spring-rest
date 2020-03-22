package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Email;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

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
