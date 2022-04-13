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

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR> {
  private ArrayList<QUASAR> _contents;

  public ALQueue(){
    _contents = new ArrayList<QUASAR>();
  }

  public QUASAR dequeue(){
    return _contents.remove(0);
  }

  public void enqueue( QUASAR x ){
    _contents.add(x);
  }

  public boolean isEmpty(){
    return _contents.size() == 0;
  }

  public QUASAR peekFront(){
    return _contents.get(0);
  }

  public static void main( String[] args ){

     Queue<String> qq = new ALQueue<String>();

     System.out.println("\nnow enqueuing...");
     qq.enqueue("1");
     qq.enqueue("2");
     qq.enqueue("3");
     qq.enqueue("4");
     qq.enqueue("5");
     qq.enqueue("6");

     System.out.println("\nnow dequeuing...");
     System.out.println( qq.dequeue() );
     System.out.println( qq.dequeue() );
     System.out.println( qq.dequeue() );
     System.out.println( qq.dequeue() );
     System.out.println( qq.dequeue() );
     System.out.println( qq.dequeue() );

     System.out.println("\nnow dequeuing fr empty queue...");
     System.out.println( qq.dequeue() );

   /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
     ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

   }//end main


}
