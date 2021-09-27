import java.lang.Math;

public class Loops{
  public static void main(String[] args){
    System.out.println(power(2, 3));
    System.out.println(factorial(5));
    System.out.println(myexp(1,4));
    for (double i = 0.1; i <= 100.0; i = i*10) {
      check(i);
    }
    for (double i = -0.1; i >= -100.0; i = i*10) {
      check(i);
    } //as the absolute value of x gets greater, the number of digits of agreement decrease
  }
  /** Exercise 3 */
  public static double power(double x, int n){
    double result = 1;
    for (int i = 0; i < n; i++) {
      result = result * x;
    }
    return result;
  }

  /** Exercise 4 */
  public static int factorial(int n){
    int result = 1;
    for (int i = n; i > 0; i--) {
      result = i * result;
    } return result;
  }

  /** Exercise 5 */
  public static double myexp(double x, int n){
    //double result = 0.0;
    // for (int i = 0; i <= n; i++) {
    //   result = result + power(x, i)/factorial(i);
    // }
    // return result;
    double sum = 1.0;
    double term = 1.0;
    for (double i = 1.0; i <= n; i++) {
      term = term * (x/i);
      sum = sum + term;
    } return sum;
  }
  public static void check(double x){
    System.out.println(x + "\t" + myexp(x,4) + "\t" + Math.exp(x));
  }
}
