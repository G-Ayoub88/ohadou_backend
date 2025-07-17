package com.example.ohadou_auto_backend.Model;

import jakarta.persistence.*;

@Entity
public class PaymentInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double amount;
    private StatutPayment statutPayment;

    @OneToOne(mappedBy = "paymentInformation")
    private Commende commende;

//    @Column(name = "cardholder_name")
//    private String cardholderName;
//
//    @Column(name = "card_number")
//    private String cardNumber;
//
//    @Column(name = "expiration_date")
//    private String expirationDate;
//
//    @Column(name = "cvv")
//    private String cvv;

    public PaymentInformation(){}

    public PaymentInformation(Long id, double amount, StatutPayment statutPayment) {
        this.id = id;
        this.amount = amount;
        this.statutPayment = statutPayment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public StatutPayment getStatutPayment() {
        return statutPayment;
    }

    public void setStatutPayment(StatutPayment statutPayment) {
        this.statutPayment = statutPayment;
    }
}
