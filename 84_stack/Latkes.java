// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW83 -- Stacks on Stacks
// 2022-03-28
// time spent: 1 hr

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
DISCO
0) For encapsulation diagrams, we put private instance variables in the "box". Draw
conduits to show what is public to user. Methods can be placed where you please
1) _stackSize is the number of Strings in _stack that are assigned a value
(starting from the bottom, from one to the next), not the length.

QCC
0) Are we supposed to expand the capacity? Does it makes sense to?
 **/


public class Latkes{
  private String[] _stack;
  private int _stackSize; // refers to the NUMBER OF ITEMS, not the capacity


  //constructor
  public Latkes( int initCapacity ){
    _stackSize = 0;
    _stack = new String[initCapacity];
  }// O(1)


  //means of insertion
  public void push( String s ){
    if (isFull()) {
      System.out.println("Out of room!"); // we did not expand the capacity
    } else {
      _stack[_stackSize] = s;
      _stackSize += 1;
    }
    // either you are about to exceed the capacity, or you don't
  }// O(1)


  //means of removal
  public String pop( ){
    if (isEmpty()){
      return null;
    }
    _stackSize -= 1;
    String str = _stack[_stackSize];
    _stack[_stackSize] = "";
    return str;
  }// O(1)

  public String peek( ){
    if (isEmpty()){
      return null;
    }
    String str = _stack[_stackSize - 1];
    return str;
  }// O(1)


  //chk for emptiness
  public boolean isEmpty(){
    if (_stackSize == 0){
      return true;
    }
    return false;
  }// O(1)


  //chk for fullness
  public boolean isFull(){
    if (_stackSize == _stack.length){
      return true;
    }
    return false;
  }// O(1)


  //main method for testing
  public static void main( String[] args ){

    Latkes tastyStack = new Latkes(10);
    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");
    //cachoo
    System.out.println( tastyStack.pop() );
    //System.out.println( tastyStack._stackSize);
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );
    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
