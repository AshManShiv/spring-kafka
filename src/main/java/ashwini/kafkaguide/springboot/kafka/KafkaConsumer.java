package ashwini.kafkaguide.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics = "ashwiniTopic", groupId = "AshwiniConsumerGroup")
    public void listen(String message) {
        log.info("Message Received: "+message);
    }
}
