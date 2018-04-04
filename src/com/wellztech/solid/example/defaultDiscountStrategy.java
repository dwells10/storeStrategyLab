package com.wellztech.solid.example;

public class defaultDiscountStrategy implements discountStrategy{

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount;
    }

}
