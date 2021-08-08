package com.example.orderapi.Order;

import com.example.orderapi.Catalog.Catalog;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 15)
    private Long orderId;

    @Column(length = 15)
    private String CustomerId;

    @Column(length = 15)
    private Boolean ifShipped;

    @Column(length = 255)
    private String shipDate;

    @Column(length = 15)
    private Boolean acceptShipDate;

    @OneToMany(targetEntity = Catalog.class, mappedBy = "skuId")
    private List<Catalog> catalogs;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }



    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public Boolean getIfShipped() {
        return ifShipped;
    }

    public void setIfShipped(Boolean ifShipped) {
        this.ifShipped = ifShipped;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public Boolean getAcceptShipDate() {
        return acceptShipDate;
    }

    public void setAcceptShipDate(Boolean acceptShipDate) {
        this.acceptShipDate = acceptShipDate;
    }

    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }
}

