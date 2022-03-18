// Team: Minions (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW78 -- Double Up
// 2022-03-16
// time spent: 2.0 hr
// KtS consumed: 1

/*
DISCO:
0) Null.Pointer.Exeception error indicates that our pointer is pointing to a location
with no memory. This was our guide to modify _head and _tail

QCC:
0) ctrl f !!
1) What do you call a list that is a loop? Because you could certainly make that using nodes
2) What is the purpose of having the nodes point in two directions? How can we utilize it?

ALGO ADD:
0) If we are adding a node at the beginning of the list, add using the constant-time add()
1) Else, find the index before where the new node should go
2) Set the cdr of the new node to what should follow it
3) Set the cdr of the node at index - 1 to the new node
4) If we are adding a node to the end of the list, point _tail to the node being added. Then, increment the list
ALGO REM:
0) Check size of the linked list. If size is 0, return empty string. Otherwise, move to next step.
1) If we are removing the node at index 0, set _head to the next node and return the removed node as a string. If not, move to next step.
2) Move a pointer to the node before the one we want to remove.
3) Change the cdr of current node to refer to the node ahead of the one being removed.
4) If we are removing the last node, set _tail to the previous node. Decrement the list and return the removed node.
*/

/***
 * class LList
 * Implements a linked list of DLLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private DLLNode _head;
  private DLLNode _tail; // last item
  private int _size;

  // constructor -- initializes instance vars
  public LList( ){
    _head = null;
    _tail = null;
    _size = 0; // so that we can modify the values later
  }


  //--------------v  List interface methods  v--------------
  public String remove(int index){
    if (_size == 0){
      return "";
    }
    else if (index == 0){
      String temp = _head.getCargo();
      _head = _head.getNext(); // we're moving the start of the array up one; the first item will get eaten by the garbage collector
      _head.setPrev( null ); // otherwise, there will be a reference to the original head
      _size -= 1;
      return temp;
    }
    else if (index > 0){
      // find the index before the one we want to remove

      DLLNode pointer = _head;
      for (int i = 0; i < index - 1; i++){ // should ultimately end up at index - 1
        pointer = pointer.getNext();
      }
      // remove it (forget it)
      String temp = pointer.getNext().getCargo();
      pointer.setNext(pointer.getNext().getNext()); //creates the forward arrow
      pointer.getNext().setPrev(pointer); // the node in front of pointer should set its previous node to pointer

      // cases regarding _tail
      if (index == _size - 1) { // you're removing at the end
        _tail = _tail.getPrev();
      } // otherwise we don't need to change tail
      _size -= 1;
      return temp;
    }
    return "";
  }

  public void add( int index, String newVal ){
    if (index == 0){
      add(newVal);
      return;
    } else if (index == _size){ // you want to add something to the end of the List
      DLLNode newItem = new DLLNode( newVal, null, _tail); // newItem, meet tail
      _tail.setNext(newItem); // tail, meet new item
      _tail = _tail.getNext();
      _size += 1;
    } else {
      // find spot before where you need to insert newVal
      DLLNode pointer = _head;
      for (int i = 0; i < index - 1; i++){ // should ultimately end up at index - 1
        pointer = pointer.getNext();
      } // pointer is now at index - 1
      DLLNode newItem = new DLLNode( newVal, pointer.getNext(), pointer); // forward and backward arrows from the new node
      pointer.setNext(newItem); // forward arrow to the new node
      newItem.getNext().setPrev(newItem); // backward arrow to the new node
      _size += 1;
      return;
    }
  }

  public boolean add( String newVal ){ // adds at the very front of the list
    // YOUR CODE HERE
    DLLNode tmp = new DLLNode( newVal, _head, null );
    _head = tmp;
    if (_size != 0){
      _head.getNext().setPrev(_head); // the old head, which is now item 1, should set its prev to the new node, item 0.
    } else { // if this is going to be the first item in the list
      _tail = _head;
    }

    _size++;
    return true;
  }


  public String get( int index ){
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    DLLNode pointer = new DLLNode("", null, null);
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
    DLLNode pointer = new DLLNode("", null, null);
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
    DLLNode pointer = new DLLNode("", null, null); // so that we don't modify the things we're going through
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

    james.add(4, "yo");
    System.out.println(james);

    System.out.println(james.remove(2));
    System.out.println(james);

    System.out.println("edge cases: \n");

    james.add(0, "YO!");
    System.out.println(james);

    System.out.println(james.remove(0));
    System.out.println(james);

    LList jill = new LList();
    System.out.println(jill.remove(1));
    System.out.println(jill);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }
}//end class LList
