package pl.klimas7.spring.jms;

import lombok.SneakyThrows;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class MessageServiceImpl implements MessageService {
    private final JmsOperations jmsOperations;

    public MessageServiceImpl(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    @Override
    public void sendMessage(String message) {
        jmsOperations.send(QueueName.TEXT, session -> session.createTextMessage(message));
    }

    @SneakyThrows
    @Override
    public String getMessage() {
        Message message = jmsOperations.receive(QueueName.TEXT);
        return ((TextMessage)message).getText();
    }

    @Override
    public void sendMessageInfo(MessageInfo messageInfo) {

    }

    @Override
    public MessageInfo getMessageInfo() {
        return null;
    }

    @Override
    public void sendTopic(String topic) {

    }
}
