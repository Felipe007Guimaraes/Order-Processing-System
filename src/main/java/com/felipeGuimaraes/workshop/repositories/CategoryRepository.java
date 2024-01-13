package com.felipeGuimaraes.workshop.repositories;

import com.felipeGuimaraes.workshop.entities.Category;
import com.felipeGuimaraes.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
