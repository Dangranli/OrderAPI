package com.example.orderapi.Catalog;

import com.example.orderapi.Catalog.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CatalogRepository extends JpaRepository<Catalog, Long> {

    Optional<Catalog> findById(Long skuId);
}