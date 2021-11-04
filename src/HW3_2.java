import java.util.Random;
import java.util.Scanner;

public class HW3_2 {

   public static void main(String args[]) {
       Random random = new Random();
       Scanner sc = new Scanner(System.in);

       String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
       System.out.println("Word is created. Try to figure out it! Input your variant");
       int setW = random.nextInt(words.length);
       String setWord = words [setW];
       String userWord;
       do {
           userWord = sc.nextLine();
           if (userWord.equals(userWord)) {
               System.out.println("You're right! Word is correct!");
           } else {
               helpToUser(userWord, setWord);
           }
       }
       while (!(userWord.equals(setWord)));
       }

       static  void  helpToUser (String userWord, String setWord) {
       String help = "";
       for (int i = 0; i < 15; i++) {
           if (i >= userWord.length() || i >=setWord.length()) {
               help += "#";
           } else if (userWord.charAt(i) == setWord.charAt(i)) {
               help += userWord.charAt(i);
           } else {
               help += "#";
           }
       }
       System.out.println(help);

       }
   }
