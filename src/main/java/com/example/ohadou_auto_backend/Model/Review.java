//package Model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//public class Review {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String review;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    @JsonIgnore
//    private Product product;
//
//    @ManyToOne
//    @JoinColumn(name = "usr_id")
//    private User usr;
//
//    private LocalDateTime createdAt;
//
//    public Review() {}
//
//    public Review(Long id, String review, Product product, User usr, LocalDateTime createdAt) {
//        this.id = id;
//        this.review = review;
//        this.product = product;
//        this.usr = usr;
//        this.createdAt = createdAt;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getReview() {
//        return review;
//    }
//
//    public void setReview(String review) {
//        this.review = review;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public User getUsr() {
//        return usr;
//    }
//
//    public void setUsr(User usr) {
//        this.usr = usr;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//}
