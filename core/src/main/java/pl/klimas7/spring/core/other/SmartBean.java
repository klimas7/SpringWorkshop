package pl.klimas7.spring.core.other;

import lombok.extern.java.Log;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Log
@Component
public class SmartBean implements InitializingBean, DisposableBean {
    private final User user;
    private User otherUser;

    public SmartBean(User user) {
        this.user = user;
        log.info("User: " + user);
    }

    //@Resource
    @Autowired
    public void setOtherUser(User otherUser) {
        this.otherUser = otherUser;
        log.info("Other user: " + otherUser);
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Post construct");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Destroy");
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet");
    }
}
