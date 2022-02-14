import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();


  private static final String SPACE = " ";

  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }


  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }

  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }
  }

  /**
   * returns a string containing all of the text in fileName (including punctuation),
   * with words separated by a single space
   */
  public static String textToString( String fileName )
  {
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));

      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();

    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }

  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is none
   */
  public static String getPunctuation( String word )
  {
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }

    return word;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);

  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  //ACTIVITY 2:
  public static double totalSentiment(String fileName) {
      String text = textToString(fileName);
      int wordStart = 0;
      double val = 0.0;
      for (int i = 0; i < text.length(); i ++) {
        if (text.substring(i, i + 1).compareTo(SPACE) == 0) {
          val += sentimentVal(text.substring(wordStart, i));
          wordStart = i + 1;
        }
      }
      return val;
    }

    public static int starRating(String fileName) {
      double totalSentiment = totalSentiment(fileName);
      if (totalSentiment > 15) {
        return 5;
      } else
      if (totalSentiment > 10) {
        return 4;
      } else
      if (totalSentiment > 5) {
        return 3;
      } else
      if (totalSentiment > 0) {
        return 2;
      } else
        return 1;
    }

//ACTIVITY 3:
  public static String fakeReview(String fileName){
   String text = textToString(fileName);
   String newRev = "";
   String word = "";
   while (text.indexOf("*") > -1 && text.indexOf(" ") > -1){
     String b = text.substring(0, text.indexOf("*"));
     text = text.substring(text.indexOf("*"));
     word = text.substring(text.indexOf("*"), text.indexOf(" "));
     word = removePunctuation(word);
     newRev += b;
     if (sentimentVal(word) > 0){
       newRev = newRev + randomPositiveAdj();
       text = text.substring(text.indexOf(" "));
     } else {
       newRev = newRev + randomNegativeAdj();
       text = text.substring(text.indexOf(" "));
     }
   }
   return newRev + text;
 }
  
// tests code, as instructed by student guide
  public static void main(String[] args){
    System.out.println(sentimentVal("hello"));
    System.out.println(sentimentVal("awesome"));
    System.out.println(sentimentVal("peers"));

    System.out.println(totalSentiment("SimpleReview.txt"));
    System.out.println(starRating("SimpleReview.txt"));

    System.out.println(fakeReview("SimpleReview.txt"));
  }
}
