package com.company;

public class Main {

    public static void main(String[] args) {

        Account[] myAccounts = new Account[3];

        Account account1 = new Account("Janet", "Ottawa","Ontario", "Canada");
        Account account2 = new Account("James", "Burpengary","Queensland", "Australia");
        Account account3 = new Account("Mehmet Fatih", "Helsingor","Fredriksborg", "Denmark");

        account1.setCardNumber(4234120954489197l);
        account2.setCardNumber(4904344348439820l);
        account3.setCardNumber(4737470823565213l);

        myAccounts[0] = account1;
        myAccounts[1] = account2;
        myAccounts[2] = account3;

        System.out.println(myAccounts[0]);
    }
}
