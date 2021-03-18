package com.company;

public class Controller {
    private Display display = new Display();
    private VATCalculator calc = new VATCalculator();
    private Dialog input = new Dialog();

    public void runController(){
        double userIn = input.userInput();
        double moms = calc.vatCalc(userIn);
        display.results(moms);
    }
}
