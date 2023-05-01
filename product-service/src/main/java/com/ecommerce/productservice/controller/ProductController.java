package com.ecommerce.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.productservice.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(ProductController.class);

    @PostMapping
    public Product add(@RequestBody Product product) {
        LOGGER.info("Product add: {}", product);
        return product;

    }
    @GetMapping
    public Product getbyId(@PathVariable int id) {
        LOGGER.info("Get Product : {}", id);
        return new Product(id, "Watch");

    }
 
}
