package com.felipeGuimaraes.workshop.repositories;

import com.felipeGuimaraes.workshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
