/* Rocks: Kevin Xiao+Mr.Swag, Melody Lew+Ollie, Anthony Sun+Corn
 * APCS
 * Lab00 - oink v1
 * 2021-11-09
 * time spent: 1 hr
 */

/* TODO:
 * Implement:
 * 	Capitalization
 * 	Punctuation
 * 	y-special cases
 */

/* DISCO:
 * indexOf() returns -1 if the index of a specified character cannot be found
 * y can sometimes be a vowel in pig latin
 *
 * QCC:
 * What are the rules for y special cases?
 * What's the most efficient way to account for all possible cases?
 *
 * NEW IN v1:
 * We handled capitalization, capitalizing the first letter if the original word was capitalized
 * We handled punctuation, appending it at the end
 */


  public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: It declares a constant that can be accessed anywhere in the class
  private static final String VOWELS = "aeiouy";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";

  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    return (w.indexOf(letter) > -1);
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    for (int counter = 0; counter < VOWELS.length(); counter++){
      if (hasA(VOWELS.substring(counter, counter+1), letter)) {
        return true;
      }
    }
    return false;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int vowelCount = 0;
    for (int counter = 0; counter < w.length(); counter++){
      if (isAVowel(w.substring(counter, counter + 1))){
        vowelCount++;
      }
    }
    return vowelCount;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    return (countVowels(w) > 0);
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    String accumulator = "";
    for (int counter = 0; counter < w.length(); counter++){
      if (isAVowel(w.substring(counter, counter + 1))){
        accumulator += w.substring(counter, counter + 1);
      }
    }
    return accumulator;
  }

    /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


      /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
    public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
    }



    /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
             return PUNCS.indexOf(symbol) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
        return CAPS.indexOf(letter) != -1;
    }


    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc(“cat.”) -> true
            hasPunc(“cat”) -> false
      =====================================*/
    public static boolean hasPunc( String w ) {
        for(int i=0; i < w.length(); i++) {
          if (isPunc(w.substring(i,i+1))) {
            return true;
          }
        }
        return false;
    }


    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {

             return isUpperCase(w.substring(0,1) );
    }




  public static String engToPig( String w ) {

    String ans = "";
    String append = "";
    if (hasPunc(w)) {
        append = w.substring(w.length()-1);
        w=w.substring(0,w.length()-1);
    }

    if ( beginsWithVowel(w.toLowerCase()) )
      ans = w + "way";

    else {
      int vPos = w.indexOf( firstVowel(w.toLowerCase()) );
      ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
    }

    if (beginsWithUpper(w)) {
      ans = ans.toLowerCase();
      ans = ans.substring(0,1).toUpperCase() + ans.substring(1);
    }

    ans = ans + append;



    return ans;
  }






  public static void main( String[] args )
  {
    System.out.println(engToPig("Ello"));
    System.out.println(engToPig("ello"));
    System.out.println(engToPig("Mother!"));
  }//end main()

}//end class Pig
