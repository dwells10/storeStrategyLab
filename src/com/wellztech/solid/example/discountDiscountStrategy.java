package com.wellztech.solid.example;

public class discountDiscountStrategy implements discountStrategy {

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }

}
