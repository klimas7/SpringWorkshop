package pl.klimas7.spring.core.xml;

import lombok.extern.java.Log;

import java.util.UUID;

@Log
public class LazyWorker implements Worker{
    private final String uuid;

    public LazyWorker() {
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        log.info("I'm Lazy worker nr: " + uuid);
    }
}
