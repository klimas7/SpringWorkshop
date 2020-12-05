package pl.klimas7.spring.core.circular;

import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Log
@Component
@Getter
public class BeanB {
    private final String MESSAGE = "BeanB";
    private final BeanA beanA;

    public BeanB(@Lazy BeanA beanA) {
        this.beanA = beanA;
        log.info("In constructor BeanB");
    }

    public String getOtherMessage() {
        log.info("BeanB: getOtherMessage");
        return this.beanA.getMESSAGE();
    }


    public void printMessage() {
        log.info(MESSAGE);
    }
}
