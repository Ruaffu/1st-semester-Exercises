package com.company;

public class Account {
    private String name;
    private String city;
    private String state;
    private String country;
    private long cardNumber;

    public Account(String name, String city, String state, String country){
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;

    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber){

        String cNumber = String.valueOf(cardNumber);
        int sum = 0;
        boolean alternate = false;
        for (int i = cNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(cNumber.substring(i, i + 1));
            if (alternate)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;

        }
        if(sum % 10 == 0){
            System.out.println(name+ ": " + "credit card number: " + cNumber + " is a valid");
        }else {
            System.out.println(name+ ": " + "credit card number: " +cNumber + " is not valid");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Account: " + "\n"+
                "name: " + name + '\n' +
                "city: " + city + '\n' +
                "state: " + state + '\n' +
                "country: " + country + '\n' +
                "cardNumber: "  + cardNumber;
    }
}
