// Team: Minions (Melody Lew, Nora Miller, Nicole Zhou)
// APCS pd06
// HW89: Queue Two Ways
// 2022-04-11
// time spent: 0.7 hr

/*
DISCO:
0) Pass through is basically when a inner class method has the same functionality
as the wrapper class method, and we could then use the method from the wrapper class
into the inner class method.
1) Linked lists are very versatile! At least compared to other collections we've learned about
2) If we do not set a value to the instance variable, we could get a NullPointerException error.

QCC:
0) Is there such a thing as a data type where you can remove/pop items from either end,
but you can only insert on one end?
*/

/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
