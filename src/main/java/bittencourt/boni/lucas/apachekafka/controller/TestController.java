package bittencourt.boni.lucas.apachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class TestController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("send")
    public ResponseEntity<?> send(){
        kafkaTemplate.send("topic-1","Envio  de: " + LocalDateTime.now());
        return ResponseEntity.ok().build();
    }

}
