// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.5 hr

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Integer> cakes = new ALStack<Integer>(5);
    // Stack<Integer> cakes = new LLStack<Integer>(5);
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*** TO TEST:
    * initialization
    * adding to the Stack
      * adding the first element
      * adding when there are already elements there
      * adding over capacity
    * popping from the Stack
      * when there's stuff to remove
      * when the Stack is empty
    * peeking from the Stack
    **/
    System.out.println("Testing...beginning items: " + cakes.isEmpty());

    System.out.println("Adding...");
    //int i = 0;
    for (int i = 0; i < 5; i++){
      cakes.push(i);
      System.out.println(cakes.peekTop());
    }

    cakes.push(22);

    System.out.println();
    while (!(cakes.isEmpty())){
      System.out.println(cakes.pop());
    }
    //cakes.pop(); // should throw an exception, because this is one too many pop()s

  }//end main

}//end class
