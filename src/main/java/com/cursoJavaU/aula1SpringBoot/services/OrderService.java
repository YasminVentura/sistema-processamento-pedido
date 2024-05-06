package com.cursoJavaU.aula1SpringBoot.services;

import com.cursoJavaU.aula1SpringBoot.entities.Order;
import com.cursoJavaU.aula1SpringBoot.repositories.OrderRepository;
import com.cursoJavaU.aula1SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findByID(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
