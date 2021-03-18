package com.company;

public class VATCalculator {
    final static int vatP = 25;

    public double vatCalc(double price){
        double vat = price / 100 * vatP;
        return vat;

    }
}
