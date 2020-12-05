package pl.klimas7.spring.profiles;

import lombok.extern.java.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//-Dspring.profiles.active=test
@Log
public class MainClass {
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("pl.klimas7.spring.profiles");

        Arrays.asList(ctx.getBeanDefinitionNames()).forEach(log::info);
        log.info("----------------");
        log.info("Active profiles: " + Arrays.toString(ctx.getEnvironment().getActiveProfiles()));
        log.info("Default profiles: " + Arrays.toString(ctx.getEnvironment().getDefaultProfiles()));


        log.info("----------------");
        var message = ctx.getBean("message", Message.class);
        message.sendMessage();
    }
}
