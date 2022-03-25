// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd 06
// HW80 -- Generically Speaking
// 2022-03-24
// time spent: 1.2 hrs

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

 public class LList<T> implements List<T> //your List.java must be in same dir
 {

   //instance vars
   private DLLNode<T> _head, _tail; //pointers to first and last nodes
   private int _size;

   // constructor -- initializes instance vars
   public LList( )
   {
     _head = _tail = null; //at birth, a list has no elements
     _size = 0;
   }


   //--------------v  List interface methods  v--------------

   //add a node to end of list
   public boolean add( T newVal )
   {
     addLast( newVal );
     return true; //per Java API spec
   }


   //insert a node containing newVal at position index
   public void add( int index, T newVal )
   {
     if ( index < 0 || index > size() )
       throw new IndexOutOfBoundsException();

     else if ( index == size() )
       addLast( newVal );

     DLLNode<T> newNode = new DLLNode( newVal, null, null );

     //if index==0, insert node before head node
     if ( index == 0 )
       addFirst( newVal );
     else {
       DLLNode<T> tmp1 = _head; //create alias to head

       //walk tmp1 to node before desired node
       for( int i=0; i < index-1; i++ )
         tmp1 = tmp1.getNext();

       //init a pointer to node at insertion index
       DLLNode<T> tmp2 = tmp1.getNext();

       //insert new node
       newNode.setNext( tmp2 );
       newNode.setPrev( tmp1 );
       tmp1.setNext( newNode );
       tmp2.setPrev( newNode );

       //increment size attribute
       _size++;
     }
   }//end add-at-index


   //remove node at pos index, return its cargo
   public T remove( int index )
   {
     if ( index < 0 || index >= size() )
       throw new IndexOutOfBoundsException();

     if ( index == 0 )
       return removeFirst();
     else if ( index == size()-1 )
       return removeLast();
     else {
       DLLNode<T> tmp1 = _head; //create alias to head

       //walk to node before desired node
       for( int i=0; i < index-1; i++ ) {
         tmp1 = tmp1.getNext();
         System.out.println( "tmp1: " + tmp1.getCargo() );
       }
       //check target node's cargo hold
       T retVal = tmp1.getNext().getCargo();

       //remove target node
       tmp1.setNext( tmp1.getNext().getNext() );
       System.out.println( "tmp1.getNext: " + tmp1.getNext().getCargo() );
       tmp1.getNext().setPrev( tmp1 );

       _size--;

       return retVal;
     }
   }


   public T get( int index )
   {
     if ( index < 0 || index >= size() )
       throw new IndexOutOfBoundsException();

     DLLNode<T> tmp = _head; //create alias to head

     //walk to desired node
     for( int i=0; i < index; i++ )
       tmp = tmp.getNext();

     //check target node's cargo hold
     T retVal = tmp.getCargo();
     return retVal;
   }


   public T set( int index, T newVal )
   {
     if ( index < 0 || index >= size() )
       throw new IndexOutOfBoundsException();

     DLLNode<T> tmp = _head; //create alias to head

     //walk to desired node
     for( int i=0; i < index; i++ )
       tmp = tmp.getNext();

     //store target node's cargo
     T oldVal = tmp.getCargo();

     //modify target node's cargo
     tmp.setCargo( newVal );

     return oldVal;
   }


   //return number of nodes in list
   public int size() { return _size; }

   //--------------^  List interface methods  ^--------------


   //--------------v  Helper methods  v--------------

   public void addFirst( T newFirstVal )
   {
     //insert new node before first node (prev=null, next=_head)
     _head = new DLLNode( newFirstVal, null, _head );

     if ( _size == 0 )
       _tail = _head;
     else
       _head.getNext().setPrev( _head );
     _size++;
   }


   public void addLast( T newLastVal )
   {
     //insert new node after last node (prev=_last, next=null)
     _tail = new DLLNode( newLastVal, _tail, null );

     if ( _size == 0 )
       _head = _tail;
     else
       _tail.getPrev().setNext( _tail );
     _size++;
   }


   public T getFirst() { return _head.getCargo(); }

   public T getLast() { return _tail.getCargo(); }


   public T removeFirst()
   {
     T retVal = getFirst();
     if ( size() == 1 ) {
       _head = _tail = null;
     }
     else {
       _head = _head.getNext();
       _head.setPrev( null );
     }
     _size--;
     return retVal;
   }

   public T removeLast()
   {
     T retVal = getLast();
     if ( size() == 1 ) {
       _head = _tail = null;
     }
     else {
       _tail = _tail.getPrev();
       _tail.setNext( null );
     }
     _size--;
     return retVal;
   }
   //--------------^  Helper methods  ^--------------


   // override inherited toString
   public String toString()
   {
     String retStr = "HEAD->";
     DLLNode<T> tmp = _head; //init tr
     while( tmp != null ) {
       retStr += tmp.getCargo() + "->";
       tmp = tmp.getNext();
     }
     retStr += "NULL";
     return retStr;
   }


   //main method for testing
   public static void main( String[] args )
   {
     LList james = new LList();

     System.out.println("initially: " );
     System.out.println( james + "\tsize: " + james.size() );

     james.add("beat");
     System.out.println( james + "\tsize: " + james.size() );

     james.add("a");
     System.out.println( james + "\tsize: " + james.size() );

     james.add("need");
     System.out.println( james + "\tsize: " + james.size() );

     james.add("I");
     System.out.println( james + "\tsize: " + james.size() );

     System.out.println( "2nd item is: " + james.get(1) );

     System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
     System.out.println( james + "\tsize: " + james.size() );

     james.add(0,"whut");
     System.out.println( "...after add(0,whut): " );
     System.out.println( james + "\tsize: " + james.size() );

     james.add(4,"phat");
     System.out.println( "...after add(4,phat): " );
     System.out.println( james + "\tsize: " + james.size() );

     System.out.println( "...after remove last: "
                         + james.remove( james._size-1) );
     System.out.println( james + "\tsize: " + james.size() );

     System.out.println( "...after remove(0): " + james.remove(0) );
     System.out.println( james + "\tsize: " + james.size() );

     System.out.println( "...after remove(0): " + james.remove(0) );
     System.out.println( james + "\tsize: " + james.size() );

     System.out.println( "...after remove(0): " + james.remove(0) );
     System.out.println( james + "\tsize: " + james.size() );
   }//end main()

  }//end class LList
