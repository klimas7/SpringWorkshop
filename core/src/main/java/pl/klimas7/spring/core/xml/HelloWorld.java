package pl.klimas7.spring.core.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@AllArgsConstructor
@Data
@Log
public class HelloWorld {
    private String message;

    public HelloWorld() {
        log.info("In constructor");
    }

    public void print() {
        log.info("Your message: " + message);
    }
}
