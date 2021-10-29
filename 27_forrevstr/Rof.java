/*
   NIWWD: Hugo Jenkins + Boary>, Jeffery Tang + Mathias, Melody Lew + Ollie
   APCS
   HW27 -- FOR the Love of Strings
   2021-10-28
   time spent: 0.8 hrs
*/

/*
DISCO:
0. length is equivalent to the number of 16-bit Unicode of the string.
1. substring can be used to return part of a string, or a substring of a string. The first input is at which index the substring begins,
the second input is at which index the substring ends.

QCC:
0. What happens if the first input of the substring is a negative integer? 
1. Likewise, what happens if the second input of the substring is greater than the length of the string?

*/

public class Rof {

  public static String FenceF(int posts) {
     String f = "|";
     for (int i = 1 ; i < posts ; i++) {
        f += "--|";
     }
     return f;
  }
  public static String reverseF(String s) {
     String r = "";
     for (int i = 1 ; i - 1< s.length() ; i++) {
        r += s.substring(s.length() - i, s.length() - i + 1);
     }
     return r;
  }
  public static String reverseR(String s) {
   String r = "";
   if (s.length() >= 1) {
      r += s.substring(s.length() - 1, s.length()) + reverseR(s.substring(0, s.length() - 1));
   }
   return r;
}

  public static void main(String[] args) {
    System.out.println("FenceF test:");
    System.out.println(FenceF(1));
    System.out.println(FenceF(2));
    System.out.println(FenceF(3));
    System.out.println("ReverseF tests:");
    System.out.println(reverseF("stressed"));
    System.out.println(reverseF("g"));
    System.out.println(reverseF("gy"));
    System.out.println("ReverseR tests:");
    System.out.println(reverseR("stressed"));
    System.out.println(reverseR("g"));
    System.out.println(reverseF("gy"));
  }
}
