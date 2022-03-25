// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd 06
// HW80 -- Generically Speaking
// 2022-03-24
// time spent: 1.2 hrs


public class DLLNode<T>{
  //instance vars
  private T _cargo;
  private DLLNode _nextNode;
  private DLLNode _prevNode;

  // constructor
  public DLLNode( T value, DLLNode next, DLLNode prev ){
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo(){
    return _cargo;
  }

  public DLLNode getNext(){
    return _nextNode;
  }

  public DLLNode getPrev(){
    return _prevNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo ){
    T foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode setNext( DLLNode newNext ){
    DLLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode setPrev( DLLNode newPrev ){
    DLLNode foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString(){
    return (String) _cargo;
  }


  //main method for testing
  public static void main( String[] args ){

    //Below is an exercise in creating a linked list...

    //Create a node
    DLLNode first = new DLLNode( "cat", null, null );

    //Create a new node after the first
    first.setNext( new DLLNode( "dog", null, null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", null, null ) );

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: It is forgotten so you can no longer go back to it.

    //...so better: ?
    DLLNode temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }

  }//end main
}//end class DLLNode
