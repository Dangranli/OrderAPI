package com.example.orderapi.Catalog;

import com.example.orderapi.Order.Order;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "catalog")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sku_id")
    private Long skuId;

    @Column(length = 15)
    private String skuDetail;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order orders;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuDetail() {
        return skuDetail;
    }

    public void setSkuDetail(String skuDetail) {
        this.skuDetail = skuDetail;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }
}

