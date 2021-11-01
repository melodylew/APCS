/*
Melody Lew
APCS pd6
HW28 -- PPMP
2021-10-29
time spent: 1.0 hrs
*/

// Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public class string2XyzThere{
  public static void main(String args[]){
    System.out.println(xyzThere("abcxyz")); // true
    System.out.println(xyzThere("abc.xyz")); // false
    System.out.println(xyzThere("xyz.abc")); // true
   }
  public boolean xyzThere(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("xyz")){
     return true;
   }
   for (int i = 1; i < str.length()-2; i++){
      if (str.charAt(i-1) != '.' && str.substring(i,i+3).equals("xyz")){
       return true;
     }
    }
    return false;
  }
}
