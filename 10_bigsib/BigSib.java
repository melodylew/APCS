// Giant Pandas -- Brian Li, Weichen Liu, Melody Lew, Robert, Blueface, Ollie
// APCS
// HW10 -- Refactor Big Sib One
// 2021-10-04

/*
DISCOVERIES
 0. By changing the "void" in a method to "String" in our BigSib.java file, we are indicating what type of value we want this method to return.
 If it returns void, then nothing will be returned in the event that this method is called. In Greet, the void returntype is simply printing out these lines,
 not necessarily "returning" anything.
    
UNRESOLVED QUESTIONS
 0. In the case that we are returning a String, like "17", and want to turn it into an integer, how would we do that since it's not a string per say?
*/

public class BigSib{
    public static String greet( String name ) {
        System.out.println("Why, hello there, " + name + ". How do you do?");
    }
}
