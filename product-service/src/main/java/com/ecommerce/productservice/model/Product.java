package com.ecommerce.productservice.model;

public class Product {
    private  int id;
    private  String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String setName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
