package com.cursoJavaU.aula1SpringBoot.repositories;

import com.cursoJavaU.aula1SpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
