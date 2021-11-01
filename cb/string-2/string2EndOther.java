/*
Melody Lew
APCS pd6
HW28 -- PPMP
2021-10-29
time spent: 1.0 hrs
*/

// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

public class string2EndOther{
  public static void main(String args[]){
    System.out.println(endOther("Hiabc", "abc")); // true
    System.out.println(endOther("AbC", "HiaBc")); // true
    System.out.println(endOther("abc", "abXabc")); // true
  }
  public boolean endOther(String a, String b) {
   a = a.toLowerCase();
   b = b.toLowerCase();
   if (a.length() >= b.length()) {
    if (a.substring(a.length() - b.length()).equals(b)) {
      return true;
      }
      } else {
        if (b.substring(b.length() - a.length()).equals(a)) {
          return true;
        }
     }
    return false;
    }
  }
}

