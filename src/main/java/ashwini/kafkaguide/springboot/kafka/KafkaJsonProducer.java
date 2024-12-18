package ashwini.kafkaguide.springboot.kafka;

import ashwini.kafkaguide.springboot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class KafkaJsonProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaJsonProducer.class);
    private final KafkaTemplate<String, User> kafkaTemplate;

    public KafkaJsonProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(User user) {

        log.info("Message with User JSON sent : {}", user.toString());
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "ashwiniJSONTopic")
                .build();

        kafkaTemplate.send(message);

    }
}
