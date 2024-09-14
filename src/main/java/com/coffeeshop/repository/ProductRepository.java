// Location: src/main/java/com/coffeeshop/repository/ProductRepository.java

package com.coffeeshop.repository;

import com.coffeeshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

