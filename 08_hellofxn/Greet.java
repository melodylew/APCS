<<<<<<< HEAD
/* Cheese: Melody Lew and Corinna Chen
=======
/* Cheese: Melody Lew and Corina Chen
>>>>>>> 118cd74e57fca19263e7513f6d80282c48c1a1b3
APCS
HW08 -- Refactor Freshie Zero
2021-09-30 */


<<<<<<< HEAD
public class Greet {
  public static void main(String[] args){
    System.out.println("No hablo queso");
  }
  public static void greet(String){
 }
=======
/* 
DISCOVERIES:
Your program must have a main() method. If you do not have a main() method, an error will appear when running the code stating that the main() method is not found.
It does not matter where you put main() in your program; as long as it's there, you are okay.

When the compiler says that an identifier is expected, that means that it expected a parameter. For example, an error occurred when we wrote:
  public static void greet(String)
 because string had to carry a parameter.
 
UNRESOLVED QUESTIONS:
Since void means that the method isn't returning anything, why are we using void here when the method is returning a printed statement?
*/

public class Greet {
  public static void main(String[] args){
    greet("Foo");
    greet("Moo");
    greet("Cheese");
  }    
  public static void greet (String name){
    System.out.println("Why, hello there, " + name + ". How do you do?");
  }
>>>>>>> 118cd74e57fca19263e7513f6d80282c48c1a1b3
}
