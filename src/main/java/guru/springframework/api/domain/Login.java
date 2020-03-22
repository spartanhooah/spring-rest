package guru.springframework.api.domain;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureDSA.SHA256;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import sun.security.provider.MD5;
import sun.security.provider.SHA;

@Data
@RequiredArgsConstructor
public class Login {
    private final String username;
    private final String password;
    private final MD5 md5;
    private final SHA sha;
    private final SHA256 sha256;
}
