// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.5 hr

import java.util.LinkedList;

public class Stack<PANCAKE> {

  private LinkedList<PANCAKE> _content;
  private int _capacity;

  public Stack (int initCapacity ){
    _content = new LinkedList<PANCAKE>();
    _capacity = initCapacity;
  }

  public boolean isEmpty(){
    return _content.size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop(){
    return _content.get(0);
  }

  //Pop and return top element of stack.
  public PANCAKE pop(){
    return _content.removeFirst();
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ){
    if (isFull()){
      _capacity = _capacity * 2;
      System.out.println("Capacity doubled");
    }
    _content.addFirst(x);
  }

  public boolean isFull(){
    return _content.size() == _capacity;
  }

}
