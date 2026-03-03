import static java.lang.System.*;

public class Word {
   private static String vowels = "AEIOUaeiou";   // shared by all Word objects
   private String word;                          // instance variable

   // constructor
   public Word(String w) {
      word = w;
   }

   // set method
   public void setWord(String w) {
      word = w;
   }

   // returns number of vowels in the word
   public int getNumVowels() {
      int count = 0;

      for (int i = 0; i < word.length(); i++) {
         if (vowels.indexOf(word.charAt(i)) != -1) {
            count++;
         }
      }

      return count;
   }

   // returns length of the word
   public int getLength() {
      return word.length();
   }

   // returns the word itself
   public String toString() {
      return word;
   }
}
