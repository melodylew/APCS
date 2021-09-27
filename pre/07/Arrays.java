import java.lang.Math;
import java.util.Random;

public class Arrays{
  public static void main(String[] args){
    printArray(powArray(testDoubleArray(5), 3));
    printArray(sieve(20));
  }

  public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
      }
      System.out.println("}");
  }

  public static void printArray(double[] a) { //method overloading
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
      }
      System.out.println("}");
  }

  public static void printArray(boolean[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
      }
      System.out.println("}");
  }

  public static double[] testDoubleArray(int n){
      Random random = new Random();
      double[] array = new double[n];
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100);
      } return array;
  }

  public static int[] testIntArray(int n){
      Random random = new Random();
      int[] array = new int[n];
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100);
      } return array;
  }

  /** Exercise 1 Problem 1 */
  public static double[] powArray(double[] a, int n){
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], n);
    } return a;
  }

  /** Exercise 1 Problem 2 */
  public static int[] histogram(int[] scores, int count){
    int[] counters = new int[count];
    for (int score : scores) {
      counters[score]++;
    } return counters;
  }
/** Exercise 4 */
  public static int indexOfMax(int[] a){
    int largestElementIndex = 0;
    for (int i = 1; i < a.length; i++){
      if (a[i] > largestElementIndex){
        largestElementIndex = i;
      }
    } return largestElementIndex;
  } //We cannot write this method using an enhanced for loop because we are returning an index and enhanced for loops are not helpful when refering to an index.

  /** Exercise 5 */
  public static boolean[] sieve(int n){
    boolean[] array = new boolean[n];
    for (int i = 2; i < n; i++){
      array[i] = true;
    } for (int i = 2; i < n; i++){
        if (array[i]) {
          for (int test = 2; test < n; test++){ //COMPOSITE
            if (test%i == 0 && test!=i){
              array[test] = false;
            }
        }
      }
    }
    return array;
  }
}
