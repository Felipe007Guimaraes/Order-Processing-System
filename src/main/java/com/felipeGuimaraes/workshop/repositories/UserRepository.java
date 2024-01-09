package com.felipeGuimaraes.workshop.repositories;

import com.felipeGuimaraes.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
