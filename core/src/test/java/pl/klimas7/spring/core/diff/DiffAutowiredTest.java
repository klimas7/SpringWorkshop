package pl.klimas7.spring.core.diff;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestConfig.class})
public class DiffAutowiredTest {
    @Autowired
//    private Circle shape;
//    private Shape square;
    @Qualifier("triangle")
    private Shape square;

    @Autowired(required = false)
    private Empty empty;

    @Test
    public void startContextTest() {
//        log.info(shape.description());
        log.info(square.description());
    }

    /*
    - Typ
    - Qualifier
    - name
     */
}
