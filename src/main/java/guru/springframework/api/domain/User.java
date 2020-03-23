package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String gender;
    private Name name;
    private Location location;

    @Email
    private String email;

    private Login login;

    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
}
