// Location: src/test/java/com/coffeeshop/CoffeeShopApplicationTests.java

package com.coffeeshop;

import com.coffeeshop.model.Product;
import com.coffeeshop.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CoffeeShopApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
    }

    @Test
    void testProductService() {
        Product product = new Product();
        product.setName("Espresso");
        product.setPrice(3.50);
        product.setDescription("A rich and bold coffee.");

        assertNotNull(productService);
        productService.saveProduct(product);
    }
}

