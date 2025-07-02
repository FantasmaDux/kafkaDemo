package com.fantasmaDux.kafkaDemo.Kafka;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics="kafka-test", groupId = "my_consumers")
    public void listen(String message) {
        System.out.println("Received message = " + message);
    }
}
