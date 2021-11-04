package bittencourt.boni.lucas.apachekafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TesteListener {

    @KafkaListener(topics = "topic-1",groupId = "group-1")
    public void listener(String message){
        log.info("thread : {}",Thread.currentThread().getId());
        log.info("recived : {}",message);
    }

}
