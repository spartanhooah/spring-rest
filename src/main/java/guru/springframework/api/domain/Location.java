package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Location implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String street;
    private final String city;
    private final String state;
    private final String postcode;
}
