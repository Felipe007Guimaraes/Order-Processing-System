package com.felipeGuimaraes.workshop.repositories;

import com.felipeGuimaraes.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
