package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@RequiredArgsConstructor
public class UserData implements Serializable {
    private static final long serialVersionUID = 1L;

    private final List<User> data;
}
