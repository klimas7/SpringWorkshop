package pl.klimas7.spring.core.other;

import lombok.extern.java.Log;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Log
@Component
public class SmartBean implements InitializingBean, DisposableBean {
    private List<User> users;
    private User otherUser;

//    public SmartBean(User user) {
//        this.users = Collections.singletonList(user);
//        log.info("User: " + users);
//    }
//
//    @Autowired
//    public SmartBean(User user, User user2) {
//        this.users = Arrays.asList(user, user2);
//        log.info("User: " + users);
//    }

    public SmartBean(List<User> users) {
        this.users = users;
        log.info("User: " + users);
    }

    //@Resource
    @Autowired
    public void setOtherUser(@Qualifier("myUser") User otherUser) {
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
