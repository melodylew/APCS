/*
Strawberry Jam: Melody Lew + Ollie, Sophia Eiden + Giraffe, Josiah Moltz + Hedwig
APCS pd6
HW35 -- A Pirate's Life for Me / Array work / Frequency, linSearch, as iterative and recursive (REFACTORED...not really)
2021-11-15
time spent: 0.8 hrs (reviewing other team's code)
*/

/*
DISCO:

   
QCC:

*/

public class Loopier{
  public static void rInt(int[] a){
    for (int i = 0; i < a.length; i++){
      a[i] = (int)(Math.random()*100);

    }
  }

  public static String toString(int[] a) {
    String result = "[";
    result += a[0];
    for (int i = 1; i < a.length; i += 1) {
      result += ", " + a[i];
    }
    result += "]";
    return result;
  }

  public static int linSearch( int[] a, int target) {
    for (int i = 0; i < a.length; i += 1) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int linSearchR( int[] a, int target) {
    //THIS TOOK US FOREEEEEVER
    if (a.length == 0) {
      return -1;
    }

    if (a[0] == target) {
      return 0;
    }

    int[] aNext = new int[a.length - 1];

    for (int i = 1; i < a.length; i += 1) {
      aNext[i - 1] = a[i];
    }

    int next = linSearchR(aNext,target);  //prevents machine abuse from occuring

    if (next == -1) {
      return -1;
    }

    return 1 + next;
  }

  public static int freq(int[] a, int target) {
    int result = 0;
    for (int i = 0; i < a.length; i += 1) {
      if (a[i] == target) {
        result += 1;
      }
    }
    return result;
  }

  public static int freqR(int[] a, int target) {
    if (a.length == 0) {
      return 0;
    }

    int[] aNext = new int[a.length - 1];

    for (int i = 1; i < a.length; i += 1) {
      aNext[i - 1] = a[i];
    }

    if (a[0] == target) {
      return 1 + freqR( aNext, target );
    }
    else {
      return freqR( aNext, target );
    }

  }

  public static void main(String[] args) {
    int[] array = new int[100];
    rInt(array);
    System.out.println(toString(array));
    System.out.println(linSearch(array, 10));
    System.out.println(linSearchR(array, 10));
    System.out.println(freq(array, 10));
    System.out.println(freqR(array, 10));
  }
}
