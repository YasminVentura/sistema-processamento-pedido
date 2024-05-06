package com.cursoJavaU.aula1SpringBoot.repositories;

import com.cursoJavaU.aula1SpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
