/*
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk
APCS pd6
HW21 -- STAtisTically Speaking...
2021-10-20
*/

/*
DISCO:
0. Integer division rounds down to 0, while double division gives a more precise approximation.

QCC:
0. Our test cases primarily test whether our methods can return an accurate value for special cases. For example, can int mean return a mean
that is not an integer? Can max return the maximum parameter when both parameters are the same value? What other cases should we include
to make our code touch all bases?
*/

public class StatsDriver {
public static void main(String[] args) {
    //int mean
		System.out.print(Stats.mean(2,4));
		System.out.println("...should be 3");
    System.out.print(Stats.mean(3,4));
		System.out.println("...should be 3"); //rounds down
    System.out.print(Stats.mean(4,4));
		System.out.println("...should be 4");
    //double mean
		System.out.print(Stats.mean(2.0,4.0));
		System.out.println("...should be 3.0");
    System.out.print(Stats.mean(3.0,4.0));
		System.out.println("...should be 3.5"); //approximates
    System.out.print(Stats.mean(4.0,4.0));
		System.out.println("...should be 4.0");
    //int max
		System.out.print(Stats.max(2,4));
		System.out.println("....should be 4");
		System.out.print(Stats.max(4,2));
    System.out.println("...should be 4");
    System.out.print(Stats.max(4,4));
    System.out.println("...should be 4");
    //double max
    System.out.print(Stats.max(2.0,4.0));
		System.out.println("....should be 4.0");
		System.out.print(Stats.max(4.0,2.0));
    System.out.println("...should be 4.0");
    System.out.print(Stats.max(4.0,4.0));
    System.out.println("...should be 4.0");
    //int geoMean
		System.out.print(Stats.geoMean(16,4));
		System.out.println("...should be 8");
    System.out.print(Stats.geoMean(16,5));
		System.out.println("...should be 8"); //rounds down
    //double geoMean
		System.out.print(Stats.geoMean(16.0,4.0));
		System.out.println("...should be 8.0");
    System.out.print(Stats.geoMean(16.0,5.0));
		System.out.println("...should be 8.9..."); //approximates
    //int max with 3 params
    System.out.print(Stats.max(2,3,4));
    System.out.println("....should be 4");
    System.out.print(Stats.max(4,3,2));
    System.out.println("...should be 4");
    System.out.print(Stats.max(4,4,4));
    System.out.println("...should be 4");
    //double max with 3 params
    System.out.print(Stats.max(2.0,3.0,4.0));
    System.out.println("....should be 4.0");
    System.out.print(Stats.max(4.0,3.0,2.0));
    System.out.println("...should be 4.0");
    System.out.print(Stats.max(4.0,4.0,4.0));
    System.out.println("...should be 4.0");
    //int geoMean with 3 params
    System.out.print(Stats.geoMean(16,4,1));
		System.out.println("...should be 8");
    System.out.print(Stats.geoMean(16,5,1));
		System.out.println("...should be 8"); //rounds down
    //double geoMean with 3 params
		System.out.print(Stats.geoMean(16.0,4.0,1.0));
		System.out.println("...should be 8.0");
    System.out.print(Stats.geoMean(16.0,5.0,1.0));
		System.out.println("...should be 8.9..."); //approximates
  }
}
