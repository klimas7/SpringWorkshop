package pl.klimas7.spring.core.annotation;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log
@Component
public class HardWorker implements Worker{
    private final String uuid;

    public HardWorker() {
        uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        log.info("I'm Hard worker nr: " + uuid);
    }

    private void born() {
        log.info("Born a hard worker nr: " + uuid);
    }

}
