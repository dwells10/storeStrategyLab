package com.wellztech.solid.example;

public class saleDiscountStrategy implements discountStrategy {

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }

}
