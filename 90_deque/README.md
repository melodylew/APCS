# team Minions
*\~Melody Lew\~*\
*\~Nora Miller\~*\
*\~Nicole Zhou\~*


TO DO:

0. add methods
   * addFirst()
   * addLast()
   
1. remove methods
   * removeFirst()
   * removeLast()
   
2. peek methods
   * peekFirst()
   * peekLast()
   
3. size()


DESIGN DECISIONS:

0. We chose to use LinkedList because we were more comfortable working with LinkedLists in queues, than we were with ArrayLists in queues.
1. We deliberately decided to avoid implementing the offer() methods from the Oracle because these methods were conscious of capacity, and we decided to focus solely on non-capacity-restricted implemenation. 
2. We chose to not implement poll() methods in our interface because we felt as though our remove() methods will suffice
3. We prioritized the add() methods because we can only test the other methods if there are elements in our deque.
