package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import payment.PaymentMethod;
@Entity
public class PaymentInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private PaymentMethod method;
    private double amount;

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

    private PaymentMethod paymentMethod;

    public PaymentInformation(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        paymentMethod.processPayment();
    }


    public PaymentInformation(Long id, PaymentMethod method, double amount, PaymentMethod paymentMethod) {
        this.id = id;
        this.method = method;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
