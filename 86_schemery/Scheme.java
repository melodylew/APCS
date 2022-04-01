// Team: Minions (Melody Lew, Nora Miller, Nicole Zhou)
// APCS pd06
// HW86 -- What a Racket
// 2022-03-31
// time spent: 2.0 hrs

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Parse string, pushing numbers and open parentheses to one stack and
        operators to another, until you reach a close parenthesis.
     2. At this point, pop the most recent operator, and as many numbers as
        you can before reaching an open parenthesis
     3. Using the values from the previous step, evaluate the expression and
        push the value to the numbers and parentheses stack.

     4. Continue until you reach the end of the string.
     5. Parse the string, from beginning to end, until all that remains is a
        number, the final answer, in the numbers and parentheses stack.
 *
 * STACK OF CHOICE: ArrayList stack
 * b/c it (and LinkedList) support generalized types.
 **/

 /**
 DISCO:
 0. Integer.parseInt() is how you convert strings to ints.

 QCC:
 0. What is causing the initial parenthesis not to be pushed to the stack?
 1. Would our current implementation work with infix and postfix languages?
 2. What is a NoSuchElement exception?

 **/

public class Scheme{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr ){
    String[] expression = expr.split("\\s+");
    Stack<String> parenNum = new Stack<String>(50);
    Stack<String> operands = new Stack<String>(50);

    while(!(operands.isEmpty())) {
      // unless there's nothing in the stacks besides a single number,
      // parse the array of string fragments:
      int i = 0; // starting index
      while (i < expression.length-1){
        // add stuff to the stack unless it's a (
        System.out.println("Current element: " + expression[i]);
        // if (isNumber(expression[i]) || expression[i] == "(") {
        //   parenNum.push(expression[i]);
        //   System.out.println("added to parenNum");
         if (expression[i] == "+" ||
                   expression[i] == "*" ||
                   expression[i] == "-"){
          operands.push(expression[i]); // in this case it's an operator
          System.out.println("added to operands");
        } else if (expression[i] == ")") { // in this case it's an open parenthesis
          // pop the operator
          String opSet = " +-*";
          int op = opSet.indexOf(operands.pop());

          Stack<String> nums = new Stack<String>(10);
          String numNow = "";
          while (numNow != "(") {
            nums.push(numNow);
          }
          System.out.println("about to evaluate unload");
          parenNum.push(unload(op, nums) );
        } else {
          parenNum.push(expression[i]);
          System.out.println("added to parenNum");
          // don't do anything if the thing you reach isn't a
          // number, operator, or parenthesis.
        }
        i = i + 1;
      } //  done this passthrough:

    } // done all of the passthroughs
    return parenNum.pop();

  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers ){
    int retVal = 0;
    if (op == 1){// add
      while (!(numbers.isEmpty())) {
        retVal += Integer.parseInt(numbers.pop());
      }
    } else if (op == 2){ // subtract
      // the last thing subtracted is the first thing in numbers, or the bottom of the stack
      // so the thing at the top of the stack is what you're subtracting from
      retVal = Integer.parseInt(numbers.pop());
      while (!(numbers.isEmpty())) {
        retVal -= Integer.parseInt(numbers.pop());
      }

    } else if (op == 3) { // multiply
      retVal = 1;
      while (!(numbers.isEmpty())) {
        retVal *= Integer.parseInt(numbers.pop());
      }
    }
    System.out.println(retVal);
    return "" + retVal;

  }//end unload()



  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch( NumberFormatException e ) {
      return false;
    }
  }



  //main method for testing
  public static void main( String[] args ){

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
