package pl.klimas7.spring.jms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class ApiController {
}

/*
GET http://localhost:8080/api/text

###
GET http://localhost:8080/api/message

###
POST http://localhost:8080/api/text?text=SiiPowerPeople

###
POST http://localhost:8080/api/message
Content-Type: application/json

{"message" : "Hello Sii People", "count": 1}
 */
