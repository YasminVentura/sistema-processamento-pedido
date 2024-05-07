package com.cursoJavaU.aula1SpringBoot.repositories;

import com.cursoJavaU.aula1SpringBoot.entities.Category;
import com.cursoJavaU.aula1SpringBoot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
