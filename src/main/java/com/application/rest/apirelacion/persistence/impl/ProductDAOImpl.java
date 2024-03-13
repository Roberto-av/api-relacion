package com.application.rest.apirelacion.persistence.impl;

import com.application.rest.apirelacion.entities.ProductEntity;
import com.application.rest.apirelacion.persistence.IProductDAO;
import com.application.rest.apirelacion.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDAOImpl implements IProductDAO {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> findAll() {
        return (List<ProductEntity>) productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<ProductEntity> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public void save(ProductEntity product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
