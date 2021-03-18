package com.company;

public class Display {

    private String currency = "kr";
    private String vat = "MOMS";

    public void results(double result){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,currency,vat);
    }
}
