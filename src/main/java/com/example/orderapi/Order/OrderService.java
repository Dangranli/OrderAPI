package com.example.orderapi.Order;

import com.example.orderapi.Catalog.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CatalogRepository catalogRepository;


    public ArrayList<Order> listAll() {
        return (ArrayList<Order>) orderRepository.findAll();

    }
}
