/*
*/

/*
DISCO:
0. To print an 
*/

import java.util.Arrays;

public class Loopier{
  public static void rInt(int[] a){
    for (int i = 0; i < a.length; i++){
      a[i] = (int)(Math.random()*100);

    }
  }
  public static void main(String[] args) {
    int[] array = new int[10];
    rInt(array);
    for (int i : array){
      System.out.println(i);
    }
    System.out.println(Arrays.toString(array));
  }
}
