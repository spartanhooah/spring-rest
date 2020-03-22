package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Data
@RequiredArgsConstructor
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String type;
    private final Long number;
    private final ZonedDateTime expirationDate;
}
