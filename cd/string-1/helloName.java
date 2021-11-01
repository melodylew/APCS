/*
Melody Lew
APCS pd6
HW28: PPMP
2021-10-29
time spent: 0.5 hrs
*/

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

public class helloName{
  public static void main(String args[]){
    System.out.println(helloName("Bob")) // "Hello Bob!"
    System.out.println(helloName("Alice")) // "Hello Alice!"
    System.out.println(helloName("X")) // "Hello X!"
   }
  
  public String helloName(String name) {
    String greeting = "Hello " + name + "!";
    return greeting;
  }
}
