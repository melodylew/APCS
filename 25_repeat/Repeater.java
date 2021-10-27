/*
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk
APCS pd6
HW25 -- Do I repeat myself?
2021-10-26
time spent: 0.8 hrs
*/

/*
DISCO:
0.  Learned that for recursion, we can return a method of a previous value 
(return fenceR(numPosts-1)).
1. Cannot initialize a variable with recursion since the variable will keep resetting.
2. If you want to build off of the value of a variable in a loop of some sort (like with f
   and oldF in fenceW()), you have to initialize it first; you can't just declare it.
3. Returning the invocation of a method results in Java running the entire method, so if
   the method prints anything in its body, this will also be among the outputs (not just
   the value it returns). (See the else statement in fenceR().)

QCC:
0. Is there any benefit to using recursion over while loops or vice versa?
1. You can't initialize variables in recursive loops (see DISCO 0) because the value will
   reset every time. In fenceR, we sidestepped this by using System.out.print to concatenate
   sections of the fence, but how else can we resolve this issue? Our way only works for
   Strings - what if we want to alter the value of an integer with each recursive call? How
   else can we create something to build off of?
 */

public class Repeater {
    public static String fenceW (int numPosts) {
        String output = "|";
        int posts = 1;
        if (numPosts == 0) {
            output = "No posts";
        }
        if (numPosts == 1) {
            return output;
        }
        while (posts < numPosts) {
            output += "--|";
            posts += 1;
        }
        return output;
    }
    public static String fenceR(int numPosts) {
        // String output = "|";
        if (numPosts == 0) {
            return "No posts";
        }
        if (numPosts == 1) {
            return "|";
        }
        else {
            System.out.print ("|--");
            return fenceR(numPosts - 1);
        }
    }
    public static void main (String[] args) {
        System.out.println(fenceW (25));
        System.out.println("\n");
        System.out.println(fenceR (10));
    }
}
