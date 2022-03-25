// Minions: Melody Lew, Nicole Zhou, Nora Miller
// APCS pd06
// HW81 -- Thank You, Next
// 2022-03-24
// time spent: 0.6 hr

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

/***
DISCO
0. We had to delete "implemets Iterator" because
  " ItrWork is not abstract and does not override
  abstract method next() in Iterator"

QCC
0. If something is abstract, it cannot be instantiated
1. Why does hasNext(), next(), and remove() still work without the interface?

SUMMARY THE FIRST:
We traversed through the List to find our desired element (key, odd, even).
Then we used methods from ArrayList to add/remove that element.

SUMMARY THE SECOND:
For using an iterator, we created an interator (Iterator it = L.iterator()) and
used methods from the Iterator interface. We used while loops to iterate through
List and met the goals of the methods.
**/


import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    for (Integer i: L){
      if (i == key){
        return true;
      }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    Iterator it = L.iterator();
    while (it.hasNext()){
      Integer val = (Integer) it.next();
      if (val == key){
        return true;
      }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    List<Integer> arr = new ArrayList<Integer>();
    for (Integer i : L){
      if (i%2 == 1){
        arr.add(i);
      }
    }
    return arr;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    List<Integer> arr = new ArrayList<Integer>();
    Iterator it = L.iterator();
    while (it.hasNext()){
      Integer val = (Integer) it.next();
      if (val%2 == 1){
        arr.add(val);
      }
    }
    return arr;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    Iterator it = L.iterator();
    while (it.hasNext()){
      Integer val = (Integer) it.next();
      if (val%2 ==0){
        it.remove();
      }
    }
  }


  public static void main( String [] args )
  {
    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();
    for( int i = 0; i < 10; i++ )
      L.add(i);
    // TASK: write code to print the contents of L...
    // a) using a FOREACH loop
    // b) explicitly using an iterator
    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );
    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );
    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);
    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);
    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
