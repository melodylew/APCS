/*
Melody Lew
APCS pd6
HW28 -- PPMP
2021-10-29
time spent: 1.0 hrs
*/

// Return true if the string "cat" and "dog" appear the same number of times in the given string.

public class string2CatDog{
  public static void main(String args[]){
    System.out.println(catDog("catdog")); // true
    System.out.println(catDog("catcat")); // false
    System.out.println(catDog("1cat1cadodog")); // true
   }
public boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  for (int i = 0; i<=str.length()-3; i++){
    if (str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't'){
      cat += 1;
    }
    if (str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g'){
      dog += 1;
    }
  }
  if (cat==dog){
    return true;
  }
  else {
    return false;
  }
}
