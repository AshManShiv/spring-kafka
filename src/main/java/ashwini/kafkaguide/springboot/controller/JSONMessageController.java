package ashwini.kafkaguide.springboot.controller;

import ashwini.kafkaguide.springboot.dto.User;
import ashwini.kafkaguide.springboot.kafka.KafkaJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JSONMessageController {

    KafkaJsonProducer kafkaJsonProducer;

    public JSONMessageController(KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping("publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaJsonProducer.send(user);
        return ResponseEntity.ok("{\"message\": \"" + user + "\"}");


    }
}
