/*
Melody Lew
APCS pd6
HW28 -- PPMP
2021-10-29
time spent: 0.5 hours
*/

//Given a string, return a string where for every char in the original, there are two chars.

public class doubleChar {
  public static void main(String args[]){
    System.out.println(doubleChar("The")); // "TThhee"
    System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
    System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
   }
  public String doubleChar(String str) {
    String word = "";
    for (int i = 0; i<=str.length()-1; i++){
     word += str.charAt(i);
     word += str.charAt(i);
    }
    return word;
  }
}

