package com.application.rest.apirelacion.service;

import com.application.rest.apirelacion.entities.ProductEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<ProductEntity> findAll();

    Optional<ProductEntity> findById(Long id);

    List<ProductEntity> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);

    void save(ProductEntity product);

    void deleteById(Long id);
}
