package pl.klimas7.spring.core.xml;

import lombok.extern.java.Log;

import java.util.UUID;

@Log
public class HardWorker implements Worker {
    private final String uuid;

    public HardWorker() {
        uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        log.info("I'm Hard worker nr: " + uuid);
    }
}
