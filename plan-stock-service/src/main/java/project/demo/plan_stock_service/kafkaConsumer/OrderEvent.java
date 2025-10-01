package project.demo.plan_stock_service.kafkaConsumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stock")
public class OrderEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String eventId;

    private String message;

    private String status;

    private String orderId;
    private String name;
    private double price;
    private double quantity;

/*
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "orderId")
    private Order order;*/
}
