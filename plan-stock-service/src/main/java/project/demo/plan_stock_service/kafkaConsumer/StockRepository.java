package project.demo.plan_stock_service.kafkaConsumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<OrderEvent,String> {
    // Removed findByCategory(String category) as 'category' does not exist in Order entity
}
