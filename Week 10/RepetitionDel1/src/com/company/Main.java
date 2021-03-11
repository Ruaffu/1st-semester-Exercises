package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // 1
        System.out.println(myIntMethod(19, 27, 6));

        // 2
        printEvenNumbers(12);

        // 3
        System.out.println("\n"+smallestAbsVal(-8,2,12));

        // 4
        sumDigits(99);

        // 5
        reverseVertical("Laptop");
        Scanner scan = new Scanner(System.in);

        // 6
        processName(scan);

        // 7
        System.out.println(repeat("Hello"));

        // 8
        shortestName(scan, 3);

        // 9
        randomNumbers();

        // 10
        maxMin();

        // 11
        printMultiple(5);

        // 12
        int [] myIntArr = {2,20,9,18};
        System.out.println(max(myIntArr));

        //13
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = {6,7,8,9,10};
        System.out.println(allLess(intArray1,intArray2));
        System.out.println(allLess(intArray2,intArray1));


    }

    // Opgave 1
    public static int myIntMethod(int a, int b, int c)
    {

        return Math.min(Math.min(a, b), c);
    }

   // Opgave 2
    public static void printEvenNumbers (int d)
    {
        int n = d;
        for (int i = 1; i <= n; i++)
        {
            if (i %2 == 0)
            {
                System.out.print("{" + i + "}"+" ");
            }
        }

    }

    // Opgave 3
    public static int smallestAbsVal(int a, int b, int c)
    {
        return Math.min(Math.min(Math.abs(a),Math.abs(b)), Math.abs(c));
    }

    // Opgave 4
    public static void sumDigits (int m){
        int n;
        int sum = 0;

        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of digits: "+sum);
    }

    // Opgave 5
    public static void reverseVertical(String s)
    {
        String reverse = "";

        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse += s.charAt(i);

        }
        System.out.println("\n"+"reversed string is: " + reverse);
    }

    // Opgave 6
    public static String processName(Scanner input)
    {
        System.out.println("Please rite your full name: ");
        String name = input.nextLine();
        System.out.println(name.toUpperCase(Locale.ROOT));
        input.close();
        return name;
    }

    // opgave 7
    public static String repeat(String t)
    {
        String repeatString = "";

        for(int i = 0; i < t.length(); i++)
        {
            repeatString += t;
        }
        return repeatString;
    }

    // Opgave 8
    public static void shortestName(Scanner n, int g)
    {
        String name = "";
        for (int i = 0; i < g; i++)
        {
            System.out.println("Enter name: ");
            String names = n.nextLine();

            if (names.length() < name.length() || name == "")
            {
                name = names;
            }

        }
        n.close();
        System.out.println("The shortest name is: "+name);

    }

    // Opgave 9
    public static void randomNumbers()
    {
        Random random = new Random();
        int randomInt;

        do {
            randomInt = random.nextInt(1000)+1;
            System.out.println(randomInt);
        }while(randomInt < 900);
    }

    // Opgave 10
    public static void maxMin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number or type -1 to stop: ");
        int number = scanner.nextInt();
        int  max = number;
        int min = number;

        while(number != -1)
        {
            if (number > max)
            {
                max = number;

            }else if(number < min)
            {
                min = number;
            }
            System.out.println("Type a number or type -1 to stop: ");
            number = scanner.nextInt();
        }
        if (max != -1 && min != -1)
        {
            System.out.println("Max was: "+max);
            System.out.println("Min was: "+min);
        }
    }

    // Opgave 11
    public static void printMultiple(int l)
    {
        String k = "";
        for (int i = 1; i <= 10; i++)
        {
            k += i*l;

            if (i != 10)
            {
                k += " og ";
            }

        }
        System.out.println(k);
    }

    // Opgave 12
    public static int max(int[] myArray)
    {
        int maxValue = myArray[0];

        for (int i = 1; i < myArray.length; i++)
        {
            if (myArray[i] > maxValue)
            {
                maxValue = myArray[i];
            }
        }
        return maxValue;
    }

    // Opgave 13
    public static boolean allLess(int[] arr1, int[] arr2)
    {
        if(arr1.length != arr2.length)
        {
            return false;
        }else{
            for (int i = 0; i < arr1.length; i++)
            {
                if (arr1[i] >= arr2[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
