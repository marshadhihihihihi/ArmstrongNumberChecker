import java.util.Scanner ;

public class ArmstrongNumberCalculation {
	
	//method to check if given number is Armstrong number or not
	public static String isArmstrongNumber (int number) {
		
		int originalNumber = number; //stores the original value of number to originalNumber var 
		int length = (int) Math.log10(number) + 1; //calculates how many digits are in the given number
		int result = 0;

		while (number != 0) {

			int lastDigit = number % 10; //extract last digit
			int lastDigitWithItsPower = (int) (Math.pow(lastDigit,length)); //power of lastDigit with number length
			result += lastDigitWithItsPower;
	
			number /= 10; // updates the number value by removing the last digit
		}

		if (result != originalNumber) {

			return "Not an Armstrong number";
		}

			return "an Armstrong number";

	}

public static void main (String...args) {

	Scanner sc = new Scanner (System.in);
	System.out.println ("\nThis program is built to find if a number is an Armstrong number or not.");
	String continueProgram;
	
	do {

	System.out.print ("Enter a number : ");
	int input = sc.nextInt ();

	System.out.println ("\nGiven number "+input+" is " +isArmstrongNumber (input));
	
	System.out.print("\nIf you want to continue this program type (y) to terminate this program type (n) : ");
	continueProgram = sc.next();

	} while (continueProgram.equalsIgnoreCase("y"));

	System.out.println ("Thank you for using my Program!");

 }
}
