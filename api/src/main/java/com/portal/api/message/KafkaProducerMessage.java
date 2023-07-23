package com.portal.api.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.portal.api.dto.CarPostDTO;

@Component
public class KafkaProducerMessage {
    @Autowired
    private KafkaTemplate<String, CarPostDTO> kafkaTemplate;

    private final String KAFKA_TOPIC = "car-post-topic";

    public void sendMessage(CarPostDTO carPostDTO) {
        kafkaTemplate.send(KAFKA_TOPIC, carPostDTO);
    }

}
