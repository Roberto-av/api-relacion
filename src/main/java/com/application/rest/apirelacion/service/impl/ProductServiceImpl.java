package com.application.rest.apirelacion.service.impl;

import com.application.rest.apirelacion.entities.ProductEntity;
import com.application.rest.apirelacion.persistence.IProductDAO;
import com.application.rest.apirelacion.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDAO productDAO;

    @Override
    public List<ProductEntity> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public List<ProductEntity> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDAO.findByPriceRange(minPrice, maxPrice);
    }

    @Override
    public void save(ProductEntity product) {
        productDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productDAO.deleteById(id);
    }
}
