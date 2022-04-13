// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent: 0.6 hrs

import java.util.LinkedList;

public class YourImplementationOfDeque<Card> implements Deque<Card>{
  private LinkedList<Card> _contents;

  public YourImplementationOfDeque(){
    _contents = new LinkedList<Card>();
  }

  public void addFirst(Card x){
    _contents.addFirst(x);
  }

  public void addLast(Card x){
    _contents.addLast(x);
  }

  public Card removeFirst(){
    return _contents.removeFirst();
  }

  public Card removeLast(){
    return _contents.removeLast();
  }

  public Card peekFirst(){
    return _contents.peekFirst();
  }

  public Card peekLast(){
    return _contents.peekLast();
  }

  public int size(){
    return _contents.size();
  }

  public String toString(){
    String retVal = "";
    for(Card i : _contents){
      retVal += i + " ";
    }
    return retVal;
  }

  public static void main(String[] args) {
    Deque<String> sentence = new YourImplementationOfDeque<String>();
    sentence.addLast("I");
    sentence.addLast("saw");
    sentence.addFirst("Yesterday");
    System.out.println(sentence);
    System.out.println("size?\t" + sentence.size());
    System.out.println("first element?\t" + sentence.peekFirst());
    System.out.println("last element?\t" + sentence.peekLast());
  }
}
