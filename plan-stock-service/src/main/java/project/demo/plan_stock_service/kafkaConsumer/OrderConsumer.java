package project.demo.plan_stock_service.kafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger logger = LoggerFactory.getLogger(OrderConsumer.class);
    @Autowired
    private StockRepository stockRepository;

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent orderEvent) {
        stockRepository.save(orderEvent);
        logger.info("Received Order Event: {}", orderEvent);
    }

}
