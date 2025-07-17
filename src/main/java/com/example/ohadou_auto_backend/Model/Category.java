package com.example.ohadou_auto_backend.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;



    private int level;
    @OneToMany(mappedBy = "category")
    private List<Product> products;




    public Category() {}

    public Category(long id, String name, int level, List<Product> products) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
