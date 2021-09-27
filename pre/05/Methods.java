public class Methods {
    public static void main(String[] args){
      System.out.println(isDivisible(4,2));
      System.out.println(isTriangle(3,4,5));
      System.out.println(ack(1,2));
    }

    public static boolean isDivisible(int n, int m){
      //* Exercise 2
      if (n % m == 0) {
        return true;
      } else {
        return false;
      }
    }

    public static boolean isTriangle(int x, int y, int z){
      //* Exercise 3
      if (x < (y+z)) {
        return true;
      } else if (y < (x+z)) {
        return true;
      } else if (z < (x+y)) {
        return true;
      } else {
        return false;
      }
    }

    public static int ack(int m, int n) {
      //* Exercise 8
      if (m < 0 || n < 0) {
        return -1;
      }
      else if (m == 0) {
        return n+1;
      } else if (m > 0 && n == 0) {
        return ack(m-1,1);
      } else if (m > 0 && n > 0) {
        return ack(m-1, ack(m, n-1));
      } return -1;
    }
}
