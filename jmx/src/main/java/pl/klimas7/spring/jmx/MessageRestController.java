package pl.klimas7.spring.jmx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageRestController {
    private final MessageManageOperation messageManageOperation;
    private final MessageNotifier messageNotifier;

    public MessageRestController(MessageManageOperation messageManageOperation, MessageNotifier messageNotifier) {
        this.messageManageOperation = messageManageOperation;
        this.messageNotifier = messageNotifier;
    }

    @GetMapping("/message")
    public String message() {
        messageNotifier.sendNotification();
        return messageManageOperation.getMessage();
    }

}
