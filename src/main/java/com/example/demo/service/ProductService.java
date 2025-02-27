package com.example.demo.service;

import com.example.demo.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> getAllProducts();
    
    Product getProductById(Long id);
    
    Product createProduct(Product product);
    
    Product updateProduct(Long id, Product productDetails);
    
    Product patchProduct(Long id, Map<String, Object> fields);
    
    void deleteProduct(Long id);
    
    List<Product> findByCategory(String category);
    
    List<Product> findByNameContaining(String name);
    
    List<Product> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
    
    List<Product> findLowStockProducts();
}