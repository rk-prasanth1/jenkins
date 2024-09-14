// Location: src/main/java/com/coffeeshop/service/ProductService.java

package com.coffeeshop.service;

import com.coffeeshop.model.Product;
import com.coffeeshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    // Other CRUD methods can go here...
}

