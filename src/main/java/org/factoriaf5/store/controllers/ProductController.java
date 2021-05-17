package org.factoriaf5.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {

    @GetMapping("/health")
    public String check() {
        String greeting = "Hello! I'm a server";
        return greeting;
    }

    public List<Product> products = new ArrayList<>();
    @GetMapping("/products")
    public List<Product> allProducts(){
        return products;
    }
}



