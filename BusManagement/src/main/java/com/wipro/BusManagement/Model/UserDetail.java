package com.wipro.BusManagement.Model;

public class UserDetail {
    private String name;
    private boolean isAdmin;
    private boolean isBusOperator;
    private boolean isConsumer;
    private Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isBusOperator() {
        return isBusOperator;
    }

    public void setBusOperator(boolean busOperator) {
        isBusOperator = busOperator;
    }

    public boolean isConsumer() {
        return isConsumer;
    }

    public void setConsumer(boolean consumer) {
        isConsumer = consumer;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
