public class sumDigits{
  public int sumDigits(int n) {
    if (n < 10) {
      return n;
    }
    return sumDigits(n/10) + n%10;
    }
}
