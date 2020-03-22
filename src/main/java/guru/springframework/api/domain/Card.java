package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.ZonedDateTime;

@Data
@RequiredArgsConstructor
public class Card {
    private final String type;
    private final Long number;
    private final ZonedDateTime expirationDate;
}
