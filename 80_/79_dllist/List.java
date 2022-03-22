// Team: Minion (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW76: We Got a Little Ol' Convoy
// 2022-03-14
// time spent: 1 hr

/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

 public interface List<T>
 {
   //add node to list, containing input T as its data
   public boolean add( T x );

   //insert at specified index
   public void add( int index, T newVal );

   //remove node from list, return its data
   public T remove( int index );

   //return data in element at position i
   public T get( int i );

   //overwrite data in element at position i
   public T set( int i, T x );

   //return length of list
   public int size();

 }//end interface
