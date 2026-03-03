import static java.lang.System.*;

class Word {

   private static String vowels = "AEIOUaeiou";
   private String word;

   public Word(String w) {
      word = w;
   }

   public void setWord(String w) {
      word = w;
   }

   public int getNumVowels() {
      int count = 0;

      for(int i = 0; i < word.length(); i++) {
         if(vowels.indexOf(word.charAt(i)) != -1) {
            count++;
         }
      }

      return count;
   }

   public int getLength() {
      return word.length();
   }

   public String toString() {
      return word;
   }
}

public class Main {

   public static void main(String[] args) {

      Word one = new Word("chicken");
      out.println(one);
      out.println("num vowels == " + one.getNumVowels());
      out.println("num chars == " + one.getLength());

      one.setWord("alligator");
      out.println("\n\n" + one);
      out.println("num vowels == " + one.getNumVowels());
      out.println("num chars == " + one.getLength());

      one.setWord("elephant");
      out.println("\n\n" + one);
      out.println("num vowels == " + one.getNumVowels());
      out.println("num chars == " + one.getLength());
   }
}
