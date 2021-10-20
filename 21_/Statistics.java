/*
UnicornHead: Melody Lew, Ariella Katz
*/

import java.lang.Math;

public class StatsDriver{
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
  
  public static void main(String[] args){
    StatsDriver test = new StatsDriver();
    test.mean(2,4);
    test.mean(3,4);
    test.mean(2.0,4.0);
    test.mean(3.0,4.0);
    test.max();
    
