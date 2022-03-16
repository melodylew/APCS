// Team: Minion (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW77 -- Insert|Remove
// 2022-03-15
// time spent: 0.9 hr
// KtS consumed: 2

/*
DISCO:
0) We will always start at the beginning of the linked list and move foward, never backwards!
QCC:
0) We do not have an edge case where the size of the list is 0 for addAt()
because that is handled by add().
ALGO ADD:
0) If we are adding a node at the beginning of the list, add using the constant-time add()
1) Else, find the index before where the new node should go
2) Set the cdr of the new node to what should follow it
3) Set the cdr of the node at index - 1 to the new node
ALGO REM:
0) Check size of the linked list. If size is 0, return false. Otherwise, move to next step.
1) If we are removing the node at index 0, set _head to the next node. If not, move to next step.
2) Move a pointer to the node before the one we want to remove.
3) Change the cdr of current node to refer to the node ahead of the one being removed.
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
  public boolean remove(int index){
    if (_size == 0){
      return false;
    }
    else if (index == 0){
      _head = _head.getNext(); // we're moving the start of the array up one; the first item will get eaten by the garbage collector
      _size -= 1;
      return true;
    }
    else if (index > 0){
      // find the index before the one we want to remove
      LLNode pointer = _head;
      for (int i = 0; i < index - 1; i++){ // should ultimately end up at index - 1
        pointer = pointer.getNext();
      }
      // remove it (forget it)
      pointer.setNext(pointer.getNext().getNext());
      return true;
    }
    return false;
  }

  public boolean addAt( int index, String newVal ){
    if (index == 0){
      add(newVal);
    } else {
      // find spot before where you need to insert newVal
      LLNode pointer = _head;
      for (int i = 0; i < index - 1; i++){ // should ultimately end up at index - 1
        pointer = pointer.getNext();
      } // pointer is now at index - 1
      LLNode newItem = new LLNode( newVal, pointer.getNext()); // the item after newItem will be the one originally at index
      pointer.setNext(newItem);
    }
    return true;
  }

  public boolean add( String newVal ){ // what is the boolean for?
    // YOUR CODE HERE
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
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

    james.add("beat");
    james.add("a");
    james.add("need");
    james.add("I");

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james );

    james.addAt(4, "yo");
    System.out.println(james);

    james.remove(2);
    System.out.println(james);

    System.out.println("edge cases: \n");

    james.addAt(0, "YO!");
    System.out.println(james);

    james.remove(0);
    System.out.println(james);

    LList jill = new LList();
    jill.remove(1);
    System.out.println(jill);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }
}//end class LList
