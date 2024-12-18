package ashwini.kafkaguide.springboot.kafka;

import ashwini.kafkaguide.springboot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJSONConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaJsonProducer.class);

    @KafkaListener(topics = "ashwiniJSONTopic", groupId = "AshwiniConsumerGroup")
    public void listen(User user) {

        log.info("Message Received: "+user.toString());

    }
}
