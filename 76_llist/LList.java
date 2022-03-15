// Team: Minion (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW76: We Got a Little Ol' Convoy
// 2022-03-14
// time spent: 1 hr

/*
DISCO:
0) Singly linked lists are really inefficient for getting or modifying data!
1) Having temp (called pointer in this file) is very important because we still want to be able to access the previous nodes.
QCC:
0) Is there a specific reason for which the add method has a boolean return value? Are there specific cases which we're trying to avoid?
*/

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( ){
    _head = null;
    _size = 0; // so that we can modify the values later
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal ){ // what is the boolean for?
    // YOUR CODE HERE
    LLNode pointer = new LLNode("", null); // so that we don't modify the things we're going through
    pointer = _head; // starts at the beginning of the list
    if (_size == 0){
      _head = new LLNode(newVal, null);
      _size += 1;
      return true;
    }
    else if (_size > 0){
      while (pointer.getNext() != null){
        pointer = pointer.getNext();
      }
      pointer.setNext(new LLNode(newVal, null));
      _size += 1;
      return true;
    }
    return false;
  }


  public String get( int index ){
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode pointer = new LLNode("", null);
    pointer = _head;
    for (int i = 0; i < index; i++){
      pointer = pointer.getNext();
    }
    return pointer.getCargo();
  }


  public String set( int index, String newVal ){

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    LLNode pointer = new LLNode("", null);
    pointer = _head;
    for (int i = 0; i < index; i++){
      pointer = pointer.getNext();
    }
    pointer.setCargo(newVal);
    return pointer.getCargo();
  }


  //return number of nodes in list
  public int size(){
    // YOUR CODE HERE
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString(){
    // YOUR CODE HERE
    LLNode pointer = new LLNode("", null); // so that we don't modify the things we're going through
    pointer = _head;
    String toPrint = "[ ";
    for (int i = 0; i < _size; i++){
      toPrint += pointer.getCargo() + " ";
      pointer = pointer.getNext();
    }
    return toPrint + "]";
  }


  //main method for testing
  public static void main( String[] args ){
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }
}//end class LList
