package tenEASYJavaProgrammingQuestions;

public class TenEasyQuestionsJAVA {

	public static void main(String[] args) {
//Write a Java program to print &quot;Hello, World!&quot; to the console.
		System.out.println("Hello, World");
		
		sumOfTwoNumbers();
		averageOfThreeNumbers();
		findNumberIfEvenOrOdd (789);
		checkNumberIfPrimeOrNot(27);
		

	}
//Write a Java program to find the sum of two numbers.
	public static void sumOfTwoNumbers () {
		int num1 = 12;
		int num2 = 7;
		int sum = num1 + num2;
		System.out.println("The sum of number 1 and number 2 is " +sum);
	}
//Write a Java program to find the average of three numbers.
	public static void averageOfThreeNumbers () {
		int num3 = 34;
		int num4 = 57;
		int num5 = 76;
		int calculateAverage = (num3 + num4 + num5) /3;
		System.out.println("The average of these three number is " +calculateAverage);
	}
//Write a Java program to check if a given number is even or odd.
	public static void findNumberIfEvenOrOdd (int number) {
		
		if (number % 2 == 0) {		
		     System.out.println("The inserted number " +number +" is EVEN");
		}else {
		     System.out.println("The inserted number " +number +" is ODD");
		}
	}
//Write a Java program to check if a given number is prime or not.
		public static void checkNumberIfPrimeOrNot(int number) {
		    boolean isPrime = number > 1 && (number == 2 || number % 2 != 0);

		    if (isPrime && number > 2) {
		        // Check for factors from 3 to the square root of number, skipping even numbers
		        for (int i = 3; i <= Math.sqrt(number); i += 2) {
		            if (number % i == 0) {
		                isPrime = false;
		                break;
		            }
		        }
		    }

		    System.out.println("The inserted number " + number + (isPrime ? " is PRIME" : " is NOT PRIME"));
		}

	}
	
	
		

