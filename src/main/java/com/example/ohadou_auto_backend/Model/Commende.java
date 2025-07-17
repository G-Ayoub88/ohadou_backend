package com.example.ohadou_auto_backend.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Commende {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="street_address")
    private String streetAddress;

    @Column(name="city")
    private String city;

    @Column(name ="state")
    private String state;

    @Column(name ="zip_code")
    private String zipCode;


    @Column(name ="q")
    private int q;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    private PaymentInformation paymentInformation;

    @ManyToMany
    @JoinTable(name = "commande_produit", joinColumns = @JoinColumn(name = "commande_id"), inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private List<Product> products = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "livraison_id", referencedColumnName = "id")
    private Livraison livraison;

    private String mobile;

    public Commende() {}

    public Commende(Long id, String streetAddress, String city, String state, String zipCode, int q, PaymentInformation paymentInformation, List<Product> products, User user, Livraison livraison, String mobile) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.q = q;
        this.paymentInformation = paymentInformation;
        this.products = products;
        this.user = user;
        this.livraison = livraison;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Livraison getLivraison() {
        return livraison;
    }

    public void setLivraison(Livraison livraison) {
        this.livraison = livraison;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
