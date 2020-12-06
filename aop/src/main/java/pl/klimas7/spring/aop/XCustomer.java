package pl.klimas7.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class XCustomer {

//    @Before("execution(public void pl.klimas7.spring.aop.Shop.buy())")
//    @Before("execution(public void pl.klimas7.spring.aop.Shop.buy(..))")
    @Before("execution(* pl.klimas7.spring.aop.Shop.buy(..))")
    public void chose() {
        log.info("chose");
    }

    @After("execution(* pl.klimas7.spring.aop.Shop.buy())")
    public void checkPrice() {
        log.info("checkPrice");
    }

    @AfterReturning("execution(* pl.klimas7.spring.aop.Shop.buy())")
    public void transport() {
        log.info("transport");
    }

    @AfterThrowing("execution(* pl.klimas7.spring.aop.Shop.buy(..))")
    public void somethingWrong() {
        log.info("somethingWrong");
    }

}
