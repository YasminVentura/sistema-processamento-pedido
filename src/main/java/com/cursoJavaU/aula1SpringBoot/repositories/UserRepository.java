package com.cursoJavaU.aula1SpringBoot.repositories;

import com.cursoJavaU.aula1SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
