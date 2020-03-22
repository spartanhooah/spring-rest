package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Name implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String title;
    private final String first;
    private final String last;
}
