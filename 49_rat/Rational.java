// Team Strawberry_JAM: Josiah Moltz, Melody Lew, Sophia Eiden
// APCS pd 06
// HW49 -
// 2021-12-22
// time spent: hrs


/*
DISCO
0.

QCC
0.

*/

public class Rational {
  private int p;
  private int q;

  public Rational() {
    p = 0;
    q = 1;
  }

  public Rational( int m, int n ) {
    this(); // slick
    if (n != 0) {
      p = m;
      q = n;
    }
  }

  public double floatValue() {
    return (double) p / q;
  }

  public String toString() {
    return p + "/" + q;
  }

  //from Stats.java
  public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    int i = 1;
    int gcd = 1;
    if (a == 0){
      return b;
    }
    while (i <= Math.min(a, b)) {
        if ((a % i == 0) && (b % i == 0)) {
            gcd = i;
        }
        i ++;
    }
    return gcd;
  }

  public void reduce(){
    int g = gcd(p,q);
    p = p / g;
    q = q / g;
  }

  //calling object: object we are calling from...
  public int compareTo(Rational r){
    if (this.floatValue() == r.floatValue()){
      return 0;
    }
    else if (this.floatValue() > r.floatValue()){
      return 1;
    }
    else {
      return -1;
    }
  }

  public boolean equals(Object o){
    if (o instanceof Rational){
      if (compareTo((Rational) o) == 0){
        return true;
      }
    }
    return false;
  }

  public void add(Rational addend){
    if (addend.q == q){ //same denominator
      p = addend.p + p;
    }
    else{ //get common denominator
      p = (p * addend.q) + (q * addend.p);
      q = (q * addend.q);
    }
  }

  public void subtract(Rational subtrahend){
    if (subtrahend.q == q){ //same denominator
      p = subtrahend.p - p;
    }
    else{ //get common denominator
      p = (p * subtrahend.q) - (q * subtrahend.p);
      q = (q * subtrahend.q);
    }
  }

  public void multiply(Rational multiplier) {
    // if we multiply p/q and m/n, the result is p * m (numerator) / q * n (denominator)
    p = p * multiplier.p; // *SNIFF SNIFF* I SMELL A QAF POST :)))))))))))
    q = q * multiplier.q;
  }

  public void divide(Rational divisor) {
    // if we divide p/q and m/n, the result is p * n (numerator) / q * m (denominator)
    if (divisor.p != 0){
      p = p * divisor.q;
      q = q * divisor.p;
    }
  }
}
