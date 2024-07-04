package com.wipro.BusManagement.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String password;

    private String name;

    private boolean isAdmin;

    private boolean isBusOperator;

    private boolean isConsumer;

    private Double balance;

    @OneToMany
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private List<Booking> booking;

    public User() {

    }

    public User( String password, String name, boolean isAdmin, boolean isBusOperator,
                boolean isConsumer, Double balance) {
        super();
//        this.userId = userId;
        this.password = password;
        this.name = name;
        this.isAdmin = isAdmin;
        this.isBusOperator = isBusOperator;
        this.isConsumer = isConsumer;
        this.balance = balance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isBusOperator() {
        return isBusOperator;
    }

    public void setBusOperator(boolean isBusOperator) {
        this.isBusOperator = isBusOperator;
    }

    public boolean isConsumer() {
        return isConsumer;
    }

    public void setConsumer(boolean isConsumer) {
        this.isConsumer = isConsumer;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
