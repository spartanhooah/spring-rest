package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String first;
    private String last;
}
