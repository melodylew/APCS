// Minion: Melody Lew, Nicole Zhou, Nora Miller
// APCS pd06
//HW75 -- Nodal Recall
//2022-03-14m
//time spent: 0.6 hr

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode{
  //instance vars
  private String car;
  private LLNode cdr;

  // constructor
  public LLNode( String value, LLNode next ){
    car = value;
    cdr = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo(){
    return this.car;
  }

  public LLNode getNext(){
    return this.cdr;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo ){
    String oldCargo = car;
    car = newCargo;
    return oldCargo;
  }

  public LLNode setNext( LLNode newNext ){
    LLNode oldNext = cdr;
    cdr = newNext;
    return oldNext;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString(){
    String str;
    str = "[" + this.car + "]->[" + this.cdr + "]";
    return str;
  }


  //main method for testing
  public static void main( String[] args ){

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //The node it just left is no longer pointed to and is "forgotten".

    //...so better: ?
    LLNode something = first;
    while( something != null ) {
      System.out.println( something );
      something = something.getNext();
      System.out.println(something);
    }
    //
    //
    //

  }//end main

}//end class LLNode
