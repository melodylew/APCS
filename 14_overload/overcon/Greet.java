// Giant Pigs -- Melody Lew, Brianna Tieu, Weichen Liu, Ollie, Pepe, and Blueface
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/*
DISCO
 0. Overloaded constructors allow us to directly edit the instance variable in the object by just changing the argument on the line that creates the object. 
 1. Overloaded constructors are convenient; it cuts down on the amount of coding we need to do.
    
QCC
 0. Is there a way to only use the default constructor to get all the different outputs we need?
 1. In what instances is it better to use default constructors instead of overload constructors?
*/


public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib(); // does not have parameter since the default constructor sets the instance variable to be what we need here.
    BigSib grizz = new BigSib("Hey ya"); // the parameter changes the helloMsg to what we want.
    BigSib dotCom = new BigSib("Sup");
    BigSib tracy = new BigSib("Salutations");
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
 
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
    
  } // end main()
  
} // end Greet
