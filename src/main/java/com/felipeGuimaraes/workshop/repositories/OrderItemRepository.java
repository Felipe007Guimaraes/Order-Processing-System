package com.felipeGuimaraes.workshop.repositories;

import com.felipeGuimaraes.workshop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
