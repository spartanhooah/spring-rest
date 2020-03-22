package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Billing {
    private final Card card;
    private final String iban;
    private final String swift;
}
