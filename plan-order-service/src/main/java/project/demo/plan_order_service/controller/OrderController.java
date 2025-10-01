package project.demo.plan_order_service.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.demo.plan_order_service.model.Order;
import project.demo.plan_order_service.model.dto.OrderDTO;
import project.demo.plan_order_service.service.OrderService;

@RestController
@RequestMapping("api/v1")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO) {
        Order order = orderService.placeOrder(orderDTO);
        return ResponseEntity.status(201).body(order);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }
}
