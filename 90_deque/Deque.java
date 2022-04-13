// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent: 0.6 hrs

public interface Deque<Card>{
  // add an element to the beinning of the queue
  public void addFirst(Card x);
  // add an element to the end of the queue
  public void addLast(Card x);
  // removes and returns the first element of the queue
  public Card removeFirst();
  // removes and returns the last element of the queue
  public Card removeLast();
  // returns the first element of the queue
  public Card peekFirst();
  // returns the last element of the queue
  public Card peekLast();

  public int size();
}
