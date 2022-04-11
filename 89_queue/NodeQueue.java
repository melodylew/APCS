//Minions: Melody Lew, Nora Miller, Nicole Zhou
//APCS pd06
//HW87 - The English Do Not Wait In Line for Soup
//2022-04-04
//time spent: 1.5 hrs

/**
DISCO:
0. To have two classes in one file, we deleted "public" from "public class LLNode"
so that LLNode can exist in a file called NodeQueue.

QCC:
0. FIFO
1. LLNode takes in two arguments.
2. LLNode has to take in type QUASAR.
*/



public class NodeQueue<QUASAR> implements Queue<QUASAR>{
  private LLNode<QUASAR> _front, _back;

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.

  public QUASAR dequeue(){
	    QUASAR retVal = _front.getCargo();
	    _front = _front.getNext();
      if (_front == null){
        _back = null;
      }
      return retVal;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
    LLNode<QUASAR> newVal = new LLNode(x, null);
    if (_back == null){
      _back = newVal;
      _front = newVal;
    }
    else{
      _back.setNext(newVal);
    _back = _back.getNext();
    }
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
      return _front == null;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    return _front.getCargo();
  }
}


class LLNode<QUASAR>
{
  //instance vars
  private QUASAR _cargo;
  private LLNode<QUASAR> _nextNode;

  // constructor
  public LLNode( QUASAR value, LLNode next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public QUASAR getCargo()
  {
    return _cargo;
  }

  public LLNode getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public QUASAR setCargo( QUASAR newCargo )
  {
    QUASAR foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------

   public String toString(){
     return _cargo.toString();
   }

}//end class LLNode
