package pl.klimas7.spring.core.other;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Component("myUser")
public class User {
    private  String id;
    private  String name;
    private  String email;
}
