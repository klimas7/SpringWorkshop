package pl.klimas7.spring.properties;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;

public class PropertyGenerator {
    public <T> Map<T, T> generate(T[] list) {
        return Stream.of(list)
                .collect(Collectors.toMap(identity(), identity()));
    }
}
