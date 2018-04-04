package com.wellztech.solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private char discountType;
    private discountStrategy strategy;

    public Customer(String customerName, double billAmount, discountStrategy discountType) {
        this.strategy = discountType;
        this.customerName = customerName;
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBillAmount() {
        return strategy.getBillAmount(billAmount);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + strategy.getBillAmount(billAmount) +
                ", discountType=" + discountType +
                '}';
    }
}
