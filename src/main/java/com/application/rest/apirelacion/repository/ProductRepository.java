package com.application.rest.apirelacion.repository;

import com.application.rest.apirelacion.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

    List<ProductEntity> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
