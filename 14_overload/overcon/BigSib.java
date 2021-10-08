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

public class BigSib {
  String helloMsg;
  
  public BigSib() {// default constructor has no args
    helloMsg = "Word Up";
  }
  
  public BigSib(String msg) {// overload constructor has args
    helloMsg = msg;
  }
  
  public String greet(String x) {
    return helloMsg + " " + x;
  }
}
