// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW88 -- BPC Kiddies Do Not Wait in Line Either
// 2022-04-04
// time spent: 2 hrs

/*
DISCO:
0) For sample(), we originally wrote LLNode<T> temp = _front and called _temp.dequeue()
  However, that was not allowed because temp is from class LLNode and it does not contain
  the method dequeue(). To solve that, we deleted temp.
1) For dequeue, we need to take into account when we delete the first and last node, as
  well as the nodes in between.

QCC:
0) When is it appropriate to use a queue versus a stack for organizing the order in which you perform functions?
1) How many times should we repeat dequeue and enqueue for the method sample()?
*/

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<T> implements Queue<T>{
  //instance variables
  private LLNode<T> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue(){
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( T enQVal ){
    if ( isEmpty() ) {
      _front = _end = new LLNode<T>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<T>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;

  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue(){
    int index = (int)(Math.random() * _size); // gives you a random index
    //System.out.println(index);

    LLNode<T> temp = _front;
    T retVal;

    // removing the first node
    if (index == 0){
      retVal = _front.getCargo();
      _front = _front.getNext(); // forgets the first node
    }
    // removing nodes after the first one
    else{
      for (int i = 0; i < index - 1; i++){
        temp = temp.getNext();
      }
      retVal = temp.getNext().getCargo();
      temp.setNext(temp.getNext().getNext());
      if (temp.getNext() == null){
        _end = temp;
      }
    }
    // when there are no more nodes in the queue
    if (_front == null){
      _end = null;
    }
    _size--;
    return retVal;
  }//O(n)


  public T peekFront(){
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   1. Dequeue a random element
       2. Requeue it (-> it is at the beginning)
       3. Do this as many times as there are elements
   **/
  public void sample(){
    for (int i = 0; i < _size; i++){
      T shuffling = dequeue();
      enqueue(shuffling);
    }
  }//O(n^2)


  public boolean isEmpty(){
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString(){
    String foo = "";
    LLNode<T> tmp = _front;
    while ( tmp != null ) {
      foo += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    return foo;
  }//end toString()



  //main method for testing
  public static void main( String[] args ){

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    PirateQueue.sample();
    System.out.println(PirateQueue);

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main
}//end class RQueue
