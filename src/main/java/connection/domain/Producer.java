package connection.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;
@Value
@Builder
public class Producer {
    private final Integer id;
    private final String name;

}
