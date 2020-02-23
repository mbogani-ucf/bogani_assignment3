package bogani_problem1;
import java.util.*;

public class CAI1 {
   public static void main(String[] args) {
       quiz();
   }

   public static void quiz() {
       Random arbitrary = new Random();

       int multiplicant = arbitrary.nextInt(10);
       int multiplier = arbitrary.nextInt(10);

       while (true) {
           int computation0 = askQuestion(multiplicant, multiplier);
           int userinput1 = readResponse();
           if (computation0 == userinput1) {
               displayCorrectResponse();
               break;
           }
           displayIncorrectResponse();
       }

   }

   public static int readResponse() {
       Scanner input = new Scanner(System.in);
       int userinput0 = input.nextInt();
       	return userinput0;
   }

   public static int askQuestion(int x, int y) {
	   int product = x * y;
       System.out.println("How much is " + x + " times " + y + "?");
       System.out.printf("Answer: ");
       return product;
   }

   public static boolean isAnswerCorrect(int userinput2, int computation1) {
       if (userinput2 == computation1) {
           return true;
       }
       return false;
   }

   public static void displayCorrectResponse() {
	   System.out.println();
       System.out.println("Very Good!");
       System.out.println();
   }

   public static void displayIncorrectResponse() {
	   System.out.println();
       System.out.println("No. Please try again.");
       System.out.println();
   }

}