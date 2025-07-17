package com.example.ohadou_auto_backend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    private String phoneNumber;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Commende>commendes=new ArrayList<>();



    private LocalDateTime createdAt;

    public User() {}

    public User(long id, String firstName, String lastName, String email, String password, String role, String phoneNumber, List<Commende> commendes, LocalDateTime createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.commendes = commendes;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Commende> getCommendes() {
        return commendes;
    }

    public void setCommendes(List<Commende> commendes) {
        this.commendes = commendes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
