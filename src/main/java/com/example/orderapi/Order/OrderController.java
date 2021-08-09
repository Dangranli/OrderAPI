package com.example.orderapi.Order;

import com.example.orderapi.Catalog.Catalog;
import com.example.orderapi.Catalog.CatalogService;
import com.example.orderapi.NotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CatalogService catalogService;

    @GetMapping("/order")
    public List<Order> OrderList() {
        List<Order> listOrders = orderService.listAll();
        return listOrders;
    }
    @GetMapping("order/{orderId}")
    public String showOneOrder(@PathVariable("orderId") Long orderId) throws NotFoundExceptions {
        Order order = orderService.getOrderById(orderId);
        return "order";
    }
    @GetMapping("Catalog/sku")
    public List<Catalog> SkuList() {
        ArrayList<Catalog> listSkus = catalogService.listAllSku();
        return listSkus;
    }
    @GetMapping("Catalog/sku/{skuId}")
    public String showOneSku(@PathVariable("skuId") Long skuId) throws NotFoundExceptions {
        Catalog catalog = catalogService.getSkuById(skuId);
        return "sku";
    }

}
