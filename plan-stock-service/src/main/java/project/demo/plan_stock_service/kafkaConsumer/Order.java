package project.demo.plan_stock_service.kafkaConsumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private double price;
    private double quantity;
}

