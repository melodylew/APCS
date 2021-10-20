/*
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk
APCS pd6
HW21 -- STAtisTically Speaking...
2021-10-20
*/

import java.lang.Math;

public class Stats{
  public static int mean(int a, int b){
    int avg = (a+b)/2;
    return avg;
  }
  public static double mean(double a, double b){
    double avg = (a+b)/2;
    return avg;
  }
  public static int max(int a, int b){
    if (a >= b){
      return a;
    }
    else {
      return b;
    }
  }
  public static double max(double a, double b){
    if (a >= b){
      return a;
    }
    else {
      return b;
    }
  }
  public static int geoMean(int a, int b){
    int mean = Math.sqrt(a*b);
    return mean;
  }
  public static double geoMean(double a, double b){
    double mean = Math.sqrt(a*b);
    return mean;
  }
}
