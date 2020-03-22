package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Billing implements Serializable {
    private static final long serialVersionUID = 1L;

    private final Card card;
    private final String iban;
    private final String swift;
}
