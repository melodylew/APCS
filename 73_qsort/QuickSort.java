// Team: Minions (Melody Lew, Nora Miller, Nicole Zhou)
// APCS pd6
// HW73: All About the About Face
// 2022-03-09
// time spent: 2 hr

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr):
 * 0) Set the last index as the pvtPos.
 * 1) Using partition, we found the index where the pivot value is.
 * 2) Split the array into two sections using the index of the pivot value.
 * 3) If the array length of the smaller array is 1, does nothing because it is sorted.
 * 4) Otherwise, repeat steps 0-4.
 
 * 2a. BEST CASE SCENARIO: O(nlogn) which occurs if the pivot position is in the middle and the array can be evenly split. Since we are partitioning 
  from the middle, if yth is close to the middle then the time complexity is reduced.
 * 2b. WORST CASE SCENARIO: O(n^2) which occurs if the pivot position is an extreme value and the array is already sorted but cannot be evenly split.

 * 3. Approach to handling duplicate values in array:
 *    No need to worry about it because it will eventually gets sorted using partition.
 DISCO:
0) pivot =/= pivot position because the value of pivot may change while pivot position does not

 **/

public class QuickSort{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ){
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a ){
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ){
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ){
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d ){
    fastHelper(d, 0, d.length - 1);
  }

  //you may need a helper method...
  public static void fastHelper( int[] arr, int lower, int upper){
    if (lower < upper){
      int newPvt = Partition.partition(arr, lower, upper);
      fastHelper(arr, lower, newPvt - 1);
      fastHelper(arr, newPvt + 1, upper);
    }
  }


  //main method for testing
  public static void main( String[] args ){
    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;

    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);

    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );

    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main
}//end class QuickSort
