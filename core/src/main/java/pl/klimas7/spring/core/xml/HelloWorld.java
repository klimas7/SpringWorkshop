package pl.klimas7.spring.core.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

@AllArgsConstructor
@Data
@Log
public class HelloWorld {
    private String message;
    private String message2;

    public HelloWorld() {
        log.info("In constructor");
    }

    public void print() {
        log.info("Your message: " + message + " : " + message2);
    }
}
