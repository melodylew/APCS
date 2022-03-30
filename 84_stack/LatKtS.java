// Team: Minions (Melody Lew, Nora Miller, Nicole Zhou)
// APCS pd06
// HW84 -- Stack: What Is It Good For?
// 2022-03-29
// time spent: 1.3 hr

/*
DISCO:
0) For allMatched(), we need to consider the case when there's still a paren
  left over in the stack.
1) If statements can be empty. Just continue if boolean statement is true.

QCC:
0) This was a LOT of if statements. Is there some more efficient
  notation for writing a whole bunch of consecutive if statments?
1) Do we have a written test this friday?
*/

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
   // initialize stack
   // 1. Put everything in a Stack
   // 2. Print everything in the stack
  public static String flip( String s ){
    Latkes toPrint = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++){ // goes through each character of s
      toPrint.push(s.substring(i, i+1));
    } // gets everythign in stack
    String str = "";
    for (int i = 0; i < s.length(); i++){
      str += toPrint.pop();
    }
    return str;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
   // RULE: You can't close an outer set of parenthesis unless all pairs of parentheses inside
   //       of it have already been closed.
  public static boolean allMatched( String s ){
    String paren, ptner;
    Latkes open = new Latkes(s.length() / 2);
    for (int i = 0; i < s.length(); i++){
      // 3.5 cases:
      // A. It's an open parenthesis -> add to Stack
      //    It's a close parenthesis -> Does it match the parenthesis at the top of the stack?
        // B. It does -> no issue
        // C. It doesn't -> you have an issue
      // D. At some point while doing this, you attempt to close parentheses that aren't there
      paren = s.substring(i, i+1); // the current value
      if (paren.equals("(") || paren.equals("{") || paren.equals("[")){
        open.push(paren); // adds it to the stack
      }
      else { // if it's a close parenthesis
        if (open.isEmpty() && i < s.length() - 1){
          return false; // finishing early case
        }
        ptner = open.pop();
        if ( ( paren.equals(")") && ptner.equals("(") ) ||
             ( paren.equals("]") && ptner.equals("[") ) ||
             ( paren.equals("}") && ptner.equals("{") ) )
        {
          //continue
        }
        else{
          return false;
        }
      }
    }
    if (!(open.isEmpty())) {
      return false; // if there's still open parentheses at the end
    }
    return true;
  }


  //main method to test
  public static void main( String[] args ){

    System.out.println(flip("stressed"));
    System.out.println(flip("swims"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
