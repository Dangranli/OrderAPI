package com.example.orderapi.Catalog;

import com.example.orderapi.Catalog.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Catalog, String> {

}