package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String md5;
    private String sha;
    private String sha256;
}
