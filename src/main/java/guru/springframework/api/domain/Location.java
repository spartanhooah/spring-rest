package guru.springframework.api.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Location {
    private final String street;
    private final String city;
    private final String state;
    private final String postcode;
}
