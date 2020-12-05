package pl.klimas7.spring.core.annotation;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log
@Component
public class LazyWorker implements Worker{
    private final String uuid;

    public LazyWorker() {
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        log.info("I'm Lazy worker nr: " + uuid);
    }

    private void born() {
        log.info("Born a lazy worker nr: " + uuid);
    }
}
