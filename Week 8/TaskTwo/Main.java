class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

   // b
   int sum = twoInts(2, 2);
   System.out.println(sum);

   // c
   String yourString = stringToUpperCase("hello");
   System.out.println(yourString);

   // d
   boolean letterCheck1 = isStringUpperCase("Greetings");
   System.out.println(letterCheck1);

    boolean letterCheck2 = isStringUpperCase("greetings");
   System.out.println(letterCheck2);
}


public static boolean iAmHappy()
{
  // fill out what is missing here: 
  if (happy == true){
    return true;
  }
    return false;
  
}

// b
public static int twoInts(int a, int b){
  int sum = a+b;

  return sum;
}

// c
public static String stringToUpperCase(String myString){
  return myString.toUpperCase();
}

// d
public static boolean isStringUpperCase(String checkString){
  boolean firstChar;
  firstChar = Character.isUpperCase(checkString.charAt(0));

  if(firstChar){
    return true;
  }
    return false;
  }

}