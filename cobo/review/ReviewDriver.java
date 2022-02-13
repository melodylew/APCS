public class ReviewDriver{
  public static void main(String[] args) {
    System.out.println(Review.sentimentVal("hello"));
    System.out.println(Review.sentimentVal("awesome"));
    System.out.println(Review.sentimentVal("peers"));
    System.out.println(Review.fakeReview("SimpleReview.txt"));
  }
}
