// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.5 hr

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{

  //private int items;
  private ArrayList<PANCAKE> _content;
  private int _capacity;

  public ALStack (int initCapacity ){
    // _items = 0;
      // We don't need this, because the size of the ArrayList will be the same as
      // the number of items
    _content = new ArrayList<PANCAKE>();
    _capacity = initCapacity;
  }// O(1)

  public boolean isEmpty(){
    return (_content.size() == 0);
  }

  public PANCAKE peekTop(){
    return _content.get(_content.size() - 1);
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    PANCAKE tmp = _content.get(_content.size() -1);
    _content.remove(_content.size() - 1);
    return tmp;
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    if (isFull()) {
      _capacity = _capacity * 2;
      System.out.println("Capacity doubled");
    }
    _content.add(x);
  }

  public boolean isFull(){
    if (_content.size() == _capacity){
      return true;
    }
    return false;
  }// O(1)


}
