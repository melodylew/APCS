public class StatsDriver{
  public static void main(String[] args){
    System.out.println("Stats test = new Stats()");
    System.out.println("test.mean(2,4)");
    System.out.println("...should be 3");
    System.out.println("test.mean(3,4)");
    System.out.println("...should be 3");
    System.out.println("test.mean(4,4)"); 
    System.out.println("...should be 4");
    System.out.println("test.mean(2.0,4.0)");
    System.out.println("...should be 3.0");
    System.out.println("test.mean(3.0,4.0)");
    System.out.println("...should be 3.5");
    System.out.println("test.mean(4.0,4.0)");
    System.out.println("...should be 4.0");
    System.out.println("test.max(3,4)");
    System.out.println("...should be 4");
    System.out.println("test.max(4,3)");
    System.out.println("...should be 4");
    System.out.println("test.max(4,4)");
    System.out.println("...should be 4");
    System.out.println("test.max(3.0,4.0)");
    System.out.println("...should be 4.0");
    System.out.println("test.max(4.0,3.0)");
    System.out.println("...should be 4.0");
    System.out.println("test.max(4.0,4.0)");
    System.out.println("...should be 4.0");
    System.out.println("test.geoMean(16,4)");
    System.out.println("...should be 8");
    System.out.println("test.geoMean(16,5)");
    System.out.println("...should be 8"); //still rounds down
    System.out.println("test.geoMean(16.0,4.0)");
    System.out.println("...should be 8.0");
    System.out.println("test.geoMean(16.0,5.0)");
    System.out.println("...should be 8.9"); //approximation 
  }
