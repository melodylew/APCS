// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW90/91 -- Swabbing the Deque/Deque the Halls
// 2022-04-13
// time spent: 0.6 hrs

public class MRKPirateBae{
  public static void main(String[] args) {
    Deque<String> sentence = new DequeOfMinions<String>();
    sentence.addLast("I");
    sentence.addLast("saw");
    sentence.addFirst("Yesterday");
    System.out.println(sentence);
    System.out.println("size?\t" + sentence.size());
    System.out.println("first element?\t" + sentence.peekFirst());
    System.out.println("last element?\t" + sentence.peekLast());
  }
}
