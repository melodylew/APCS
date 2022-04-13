// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent: 0.6 hrs


import java.util.LinkedList;

public class DequeOfMinions<Card> implements Deque<Card>{
  private LinkedList<Card> _contents;

  public DequeOfMinions(){
    _contents = new LinkedList<Card>();
  }

  public void addFirst(Card x){
    _contents.add(0, x);
  }

  public void addLast(Card x){
    _contents.add(x);
  }

  public String toString(){
    String retVal = "";
    for(Card i : _contents){
      retVal += i + " ";
    }
    return retVal;
  }

  // public Card removeFirst(){
  //
  // }
  //
  // public Card removeLast(){
  //
  // }
  //
  // public Card peekFirst(){
  //
  // }
  //
  // public Card peekLast(){
  //
  // }
  //
  // public int size(){
  //
  // }

  public static void main(String[] args) {
    Deque<String> sentence = new YourImplementationOfDeque<String>();

    sentence.addLast("I");
    sentence.addLast("saw");
    System.out.println(sentence);
    sentence.addFirst("Yesterday,")
  }
}
