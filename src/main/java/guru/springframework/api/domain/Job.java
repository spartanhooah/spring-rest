package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Job {
    private final String title;
    private final String company;
}
