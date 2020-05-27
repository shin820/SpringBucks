package com.example.demo.repository;

import com.example.demo.model.CoffeeOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoffeeOrderRepository extends BaseRepository<CoffeeOrder, Long> {
    List<CoffeeOrder> findByCustomerOrderById(String customer);
    List<CoffeeOrder> findByItems_Name(String name);
}
