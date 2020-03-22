package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Name {
    private final String title;
    private final String first;
    private final String last;
}
