package ashwini.kafkaguide.springboot.kafka;

import ashwini.kafkaguide.springboot.dto.User;
import ashwini.kafkaguide.springboot.entity.UserEntity;
import ashwini.kafkaguide.springboot.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJSONConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaJsonProducer.class);

    private final UserRepository userRepository;

    public KafkaJSONConsumer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @KafkaListener(topics = "ashwiniJSONTopic", groupId = "AshwiniConsumerGroup")
    public void listen(User user) {
        log.info("Message Received: "+user.toString());
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setUserId(Integer.parseInt(user.getUserId()));
        userRepository.save(userEntity);
    }
}
