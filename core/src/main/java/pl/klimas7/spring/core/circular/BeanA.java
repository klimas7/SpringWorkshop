package pl.klimas7.spring.core.circular;

import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Log
@Getter
@Component
public class BeanA {
    private final String MESSAGE = "BeanA";
    private final BeanB beanB;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
        log.info("In constructor BeanA");
    }

    public String getOtherMessage() {
        log.info("BeanA: getOtherMessage");
        return this.beanB.getMESSAGE();
    }

    public void printMessage() {
        log.info(MESSAGE);
    }
}
