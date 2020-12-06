package pl.klimas7.spring.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class EventRestController {

    @PostMapping("/processMessage/{message}")
    public void processMessage(@PathVariable String message) {
        log.info("Process message: " + message);
    }
}
