// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW90/91 -- Swabbing the Deque/Deque the Halls
// 2022-04-13
// time spent: 0.6 hrs

import java.util.LinkedList;

public class DequeOfMinions<Card> implements Deque<Card>{
  private LinkedList<Card> _contents;

  public DequeOfMinions(){
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
}
