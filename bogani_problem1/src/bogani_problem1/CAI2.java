package bogani_problem1;
import java.security.SecureRandom;
import java.util.*;

public class CAI2 {
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
		Random randomsrc = new Random();
		int randomresp = randomsrc.nextInt(4)+1;
		switch (randomresp) {
			case 1:
				System.out.println("Very Good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice Work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
		}
	}

	public static void displayIncorrectResponse() {
		Random randomsrc = new Random();
		int randomresp = randomsrc.nextInt(4)+1;
		switch (randomresp) {
			case 1:
				System.out.println("No. Please try again.");
				break;
			case 2:
				System.out.println("Wrong.Try once more.");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
			case 4:
				System.out.println("No Keep trying.");
				break;
		}
	}
}