// Giant Pigs -- Melody Lew, Brianna Tieu, Weichen Liu, Ollie, Pepe, and Blueface
// APCS
// HW14 -- Customize Your Creation
// 2021-10-07

/* 
DISCO
 0. As of now, we need the method setHelloMsg if we only have one default constructor.
 1. Typing the same code over and over again really helps with memorization. 
 
QCC
 0. Is there a way to only use the default constructor to get all the different outputs we need? 
*/

public class BigSib {
    String helloMsg;

  public BigSib () { //constructor
    helloMsg = "Word Up";
  }
    
  public void setHelloMsg (String newHelloMsg) {
    helloMsg = newHelloMsg;
  }
  
  public String greet (String x) {
    return (helloMsg + " " + x);
  }
} 
