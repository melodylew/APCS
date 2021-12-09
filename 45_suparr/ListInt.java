// Strawberry JAM: Melody Lew, Sophia Eiden, Josiah Moltz
// APCS pd6
// HW45 -- Array of Titanium / Writing an interface / writing ListInt as an interface to implement in SuperArray
// 2021-12-08
// time spent: .7

public interface ListInt {
  public boolean add( int x ) ;

  public boolean add( int index, int newVal) ;  //overloaded for add-at-index

  public boolean remove( int index ) ;

  public int size() ;

  //removed get and set in accordance with assignments page
}
