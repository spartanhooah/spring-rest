package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String username;
    private final String password;
    private final String md5;
    private final String sha;
    private final String sha256;
}
