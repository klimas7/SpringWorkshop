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
        jmsOperations.convertAndSend(QueueName.TEXT, message);
    }

    @SneakyThrows
    @Override
    public String getMessage() {
        Message message = jmsOperations.receive(QueueName.TEXT);
        return ((TextMessage) message).getText();
    }

    @Override
    public void sendMessageInfo(MessageInfo messageInfo) {
        jmsOperations.convertAndSend(QueueName.OBJECT, messageInfo);

    }

    @Override
    public MessageInfo getMessageInfo() {
        return (MessageInfo) jmsOperations.receiveAndConvert(QueueName.OBJECT);
    }

    @Override
    public void sendTopic(String topic) {

    }
}
