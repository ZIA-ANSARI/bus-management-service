package com.wipro.BusManagement.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private Double transactionAmount;

    private Boolean isCredit;

    private Date timeStamp;

    public Transaction(Long transactionId, Double transactionAmount, Boolean isCredit, Date timeStamp) {
        super();
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
        this.isCredit = isCredit;
        this.timeStamp = timeStamp;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Boolean getIsCredit() {
        return isCredit;
    }

    public void setIsCredit(Boolean isCredit) {
        this.isCredit = isCredit;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp() {
        this.timeStamp = new Date();
    }

    @PreUpdate
    void updatedAt() {
        this.timeStamp = new Date();
    }

    @PrePersist
    void createdAt() {
        this.timeStamp = new Date();
    }

}