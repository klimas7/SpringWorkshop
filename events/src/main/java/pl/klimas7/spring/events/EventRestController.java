package pl.klimas7.spring.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class EventRestController {
    private final ApplicationEventPublisher applicationEventPublisher;

    public EventRestController(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @PostMapping("/processMessage/{message}")
    public void processMessage(@PathVariable String message) {
        log.info("Process message: " + message);

        applicationEventPublisher.publishEvent(new MessageEvent(this, message));
        log.info("After publish event: " + message);
    }
}
