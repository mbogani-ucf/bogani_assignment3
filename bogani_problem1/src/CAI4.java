import java.security.SecureRandom;
import java.util.*;

public class CAI4 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String mainanswer;

       do {
           
           quiz(input);
           
           System.out.print("Re-start (Y/N)?: ");
           mainanswer = input.next();
           System.out.println();
       } while (mainanswer.equalsIgnoreCase("Y"));
       input.close();
   }

   public static void quiz(Scanner input) {
       SecureRandom arbitrary = new SecureRandom();
       int correct = 0;
       int difficulty = readDifficulty(input);
       System.out.println();
       for (int i = 1; i <= 10; i++) {
           int multiplicant = generateQuestionArgument(arbitrary, difficulty);
           int multiplier = generateQuestionArgument(arbitrary, difficulty);
           int product = multiplicant * multiplier;

           askquestion(multiplicant, multiplier);

           int response = readResponse(input);

           if (isAnswerCorrect(product, response)) {
               displayCorrectResponse(arbitrary);
               correct++;
           } else
               displayIncorrectResponse(arbitrary);
       }
       displayCompletionMessage(correct);
   }


   private static int generateQuestionArgument(SecureRandom arbitrary, int difficulty) {
       int mainargument = 0;
      
       if (difficulty == 1) {
           mainargument = arbitrary.nextInt(10);
       }
       else if (difficulty == 2) {
           mainargument = arbitrary.nextInt(100);
       }
       else if (difficulty == 3) {
           mainargument = arbitrary.nextInt(1000);
       }
       else {
           mainargument = arbitrary.nextInt(10000);
       }
       return (mainargument);
   }


   private static int readDifficulty(Scanner input) {
	   	System.out.println("1. 1 decimal place \n2. 2 decimal places \n3. 3 decimal places \n4. 4 decimal places\n");
		System.out.println("Enter difficulty level (1-2-3-4)");
		System.out.println("Choice: ");
		return (input.nextInt());
   }

   private static void displayIncorrectResponse(SecureRandom rand) {
		Random randomsrc = new Random();
		int randomresp = randomsrc.nextInt(4)+1;
		switch (randomresp) {
			case 1:
				System.out.println("No. Please try again.");
				System.out.println();
				break;
			case 2:
				System.out.println("Wrong.Try once more.");
				System.out.println();
				break;
			case 3:
				System.out.println("Don't give up!");
				System.out.println();
				break;
			case 4:
				System.out.println("No Keep trying.");
				System.out.println();
				break;
		}
	}
   
   private static boolean isAnswerCorrect(int userinput2, int computation1) {
	   if (userinput2 == computation1) {
			return true;
		}
		return (false);
   }

   private static int readResponse(Scanner input) {
       System.out.printf("Answer: ");
       int userinput0 = input.nextInt();
       return userinput0;
   }

   private static void askquestion(int x, int y) {
       System.out.println("How much is " + x + " times " + y + "?");
   }

   private static void displayCorrectResponse(SecureRandom rand) {
		Random randomsrc = new Random();
		int randomresp = randomsrc.nextInt(4)+1;
		switch (randomresp) {
			case 1:
				System.out.println("Very Good!");
				System.out.println();
				break;
			case 2:
				System.out.println("Excellent!");
				System.out.println();
				break;
			case 3:
				System.out.println("Nice Work!");
				System.out.println();
				break;
			case 4:
				System.out.println("Keep up the good work!");
				System.out.println();
				break;
		}
	}


   public static void displayCompletionMessage(int collected){
       float score =(float)collected/10*100;  
       System.out.println("Your Score is " + Math.round(score) + "%");
       if(score>=75) {
           System.out.println("Congratulations, you are ready to go to the next level!");
       }
       else {
           System.out.println("Please ask your teacher for extra help.");
       }
   }
}


