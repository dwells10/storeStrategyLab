package com.wellztech.solid.example;

public class liquidationDiscountClass implements discountStrategy {

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }

}
