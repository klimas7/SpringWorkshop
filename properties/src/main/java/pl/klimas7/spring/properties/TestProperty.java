package pl.klimas7.spring.properties;

import org.springframework.stereotype.Component;

@Component
public class TestProperty {
    private final String property = "testProperties";

    public String getProperty() {
        return property;
    }
}
