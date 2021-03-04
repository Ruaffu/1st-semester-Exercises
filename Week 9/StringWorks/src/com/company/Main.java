package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[12][1];
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/data.txt");
        Scanner scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()){
            text[i] = scan.nextLine().split(" ");
            i++;
        }

        printWordsWithDoubleConsonant();
        printLongestSentence();
        printPartOfWord("København", 6, 4);
        printIfPalindrome("toOt");
    }

    // Task 1 - Print alle ord der har dobbeltkonsonant i sig.
    private static void printWordsWithDoubleConsonant(){
        boolean isConsonant;

        for (int i = 0; i < text.length; i++) {
            for(String word : text[i]){
                for (int j = 0; j < word.length(); j++) {
                    if (j != word.length()-1){
                        if (word.toLowerCase().charAt(j) == word.toLowerCase().charAt(j+1)){
                            isConsonant = isWordValid(word.charAt(j));

                            if (isConsonant){
                                System.out.println(word);
                            }
                        }
                    }
                }
            }
        }

    }

    // checks if the characters are vowels or digits.
    private static boolean isWordValid(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};

        for (int i = 0; i < vowels.length; i++) {
            if (c == vowels[i] || Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    // Task 2. - Print den længste sætning i teksten.
    private static void printLongestSentence() throws FileNotFoundException{
        File file = new File("src/data.txt");
        Scanner scan = new Scanner(file);
        String longestSentence = "";
        String currentSentence;

        while (scan.hasNextLine()){
            String[] splitArray = scan.nextLine().split("\\. ");
            currentSentence = Arrays.toString(splitArray);

           if (currentSentence.length() > longestSentence.length()){
               longestSentence = currentSentence;
           }
        }

        System.out.println("\nthe longest sentence is: " +"\n"+ longestSentence+"\n");
    }

    // Task 3. - print en delmængde(subset in english) (substring) af et ord
    private static void printPartOfWord(String word, int indexStart, int indexEnd){

        System.out.println("The substring of "+word+" is: ");
        try {
            System.out.println(word.substring(indexStart, indexEnd + 1));
        }catch(StringIndexOutOfBoundsException e){
            if (indexStart < word.length()){
                System.out.println(word.substring(indexStart)+"\n");
            } else if (indexStart > word.length()){
                System.out.println("Error: indexStart is greater than the words length!");
            }

        }

    }

    // Task 4. - print ordet hvis det er et palindrom
    private static void printIfPalindrome(String inputString){
        String reverseString = "";

        for ( int i = inputString.length() - 1 ; i >= 0 ; i-- ) {
            reverseString =  reverseString + inputString.charAt(i);
        }

        if (inputString.equalsIgnoreCase(reverseString)) {
            System.out.println("Input string: "+inputString+" "+" \nis a palindrome.\n");
        }else{
            System.out.println("Input string: "+inputString+" "+" \nis not a palindrome.\n");

        }
    }

}
