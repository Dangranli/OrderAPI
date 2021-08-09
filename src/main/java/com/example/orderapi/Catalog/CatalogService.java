package com.example.orderapi.Catalog;

import com.example.orderapi.NotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CatalogService {
    @Autowired
    public CatalogRepository catalogRepository;

    public ArrayList<Catalog> listAllSku() {
        return (ArrayList<Catalog>) catalogRepository.findAll();
    }

    public Catalog getSkuById(Long skuId) throws NotFoundExceptions {
        Optional<Catalog> detail = catalogRepository.findById(skuId);
        if(detail.isPresent()) {
            return detail.get();
        }
        throw new NotFoundException("Could not find any skus with ID " + skuId);
    }
}

