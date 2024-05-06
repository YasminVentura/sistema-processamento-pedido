package com.cursoJavaU.aula1SpringBoot.repositories;

import com.cursoJavaU.aula1SpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
