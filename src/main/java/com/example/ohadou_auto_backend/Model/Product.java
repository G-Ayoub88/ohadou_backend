package com.example.ohadou_auto_backend.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "prix")
    private double price;

    @Column(name = "discounted_price")
    private int discountedPrice;

    @Column(name = "discount_persent")
    private int discountPercent;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "num_category")
    private int numCategory;

    @ManyToMany(mappedBy = "products")
    private List<Commende> commandes = new ArrayList<>();


    private LocalDateTime createdAt;


    public Product() {}


    public Product(Long id, String title, String description, double price, int discountedPrice, int discountPercent, int quantity, String imageUrl, Category category, int numCategory, List<Commende> commandes, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountPercent = discountPercent;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.category = category;
        this.numCategory = numCategory;
        this.commandes = commandes;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNumCategory() {
        return numCategory;
    }

    public void setNumCategory(int numCategory) {
        this.numCategory = numCategory;
    }

    public List<Commende> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commende> commandes) {
        this.commandes = commandes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}







