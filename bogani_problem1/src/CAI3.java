import java.security.SecureRandom;
import java.util.*;

public class CAI3 {
   public static void main(String[] args) {
           quiz();
       }

   public static void quiz() {
       Random arbitrary = new Random();
       Scanner r_input=new Scanner(System.in);
       int i=1,correct=0,wrong=0;

       while (i<=10) {
           int multiplicant = arbitrary.nextInt(10);
           int multiplier = arbitrary.nextInt(10);
           int computation0 = askQuestion(multiplicant, multiplier);
           int userinput1 = readResponse();
           if (computation0 == userinput1) {
               displayCorrectResponse();
               correct++;      
           }
           else{
               displayIncorrectResponse();
               wrong++;   
           }           
           i++;
       }
       displayCompletionMessage(correct);   
       System.out.printf("Re-start (Y/N)?: ");       
       char ch=r_input.next().charAt(0);
       if(ch=='Y'){
           quiz();
       }	
       else {
           System.exit(0);  
       }
   }

	public static int readResponse() {
		System.out.printf("Answer: ");
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

	public static void displayIncorrectResponse() {
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
   public static void displayCompletionMessage(int collected){
       float score =(float)collected/10*100;  
       System.out.println("Your Score is " + Math.round(score) + "%");
       if(score>=75)
           System.out.println("Congratulations, you are ready to go to the next level!");
       else
           System.out.println("Please ask your teacher for extra help.");
   }

}