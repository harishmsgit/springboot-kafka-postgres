package project.demo.plan_order_service.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.demo.plan_order_service.model.Order;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String message;
    private String status;
    private String orderId;
    private String name;
    private double price;
    private double quantity;
}