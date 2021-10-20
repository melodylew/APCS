/*
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk
APCS pd6
HW21 -- STAtisTically Speaking...
2021-10-20
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
    System.out.print(Stats.geoMean(16,5));
		System.out.println("...should be 8.9"); //approximates
	}
}
