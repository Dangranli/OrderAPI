package com.example.orderapi.Order;

import com.example.orderapi.Catalog.Catalog;
import com.example.orderapi.Catalog.CatalogRepository;
import com.example.orderapi.NotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public ArrayList<Order> listAll() {
        return (ArrayList<Order>) orderRepository.findAll();

    }
    public Order getOrderById(Long orderId) throws NotFoundExceptions{
        Optional<Order> result = orderRepository.findById(orderId);
        if(result.isPresent()) {
            return result.get();
        }
        throw new NotFoundException("Could not find any orders with ID " + orderId);
    }
}
