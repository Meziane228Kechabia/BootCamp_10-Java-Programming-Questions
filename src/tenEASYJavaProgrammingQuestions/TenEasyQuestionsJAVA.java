package tenEASYJavaProgrammingQuestions;

import java.util.Random;
import java.util.Scanner;

public class TenEasyQuestionsJAVA {

	

	public static void main(String[] args) {
//Write a Java program to print &quot;Hello, World!&quot; to the console.
		System.out.println("Hello, World");
		
		sumOfTwoNumbers(67,43);
		averageOfThreeNumbers(15,45,30);
		findNumberIfEvenOrOdd (789);
		checkNumberIfPrimeOrNot(27);
		checkIfGivenStringIsAPalindromeOrNot("Florida");
		reverseAGivenString();
		implementingASimpleCalculator();
		convertFahrenheitToCelsius ();
		generateRandomNumberFromOneToHundred ();
	}
//Write a Java program to find the sum of two numbers.
	public static void sumOfTwoNumbers (int num1, int num2) {
		 
		int sum = num1 + num2;
		System.out.println("The sum of number 1 and number 2 is " +sum);
	}
//Write a Java program to find the average of three numbers.
	public static void averageOfThreeNumbers (int num3, int num4, int num5 ) {
		
		int calculateAverage = (num3 + num4 + num5) /3;
		System.out.println("The average of the inserted three number is " +calculateAverage);
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
//Write a Java program to check if a given string is a palindrome or not
		public static void checkIfGivenStringIsAPalindromeOrNot(String str) {
		    if (isPalindrome(str)) {
		        System.out.println("The inserted word is a palindrome: " + str);
		    } else {
		        System.out.println("The inserted String is NOT a palindrome: " + str);
		    }
		}

		public static boolean isPalindrome(String str) {
		    // Remove spaces and convert to lowercase for case-insensitive comparison
		    str = str.replaceAll("\\s+", "").toLowerCase();
		    
		    int left = 0;
		    int right = str.length() - 1;
		    
		    while (left < right) {
		        if (str.charAt(left) != str.charAt(right)) {
		            return false;
		        }
		        left++;
		        right--;
		    }
		    
		    return true;
		}
			
//Write a Java program to reverse a given string.		    
			    			    
		public static void reverseAGivenString() {
	        String str = "California";
	        String reversed = reverseString(str);
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reversed);
	    }
	    
	    public static String reverseString(String str) {
	        // Create a StringBuilder object to store the reversed string
	        StringBuilder sb = new StringBuilder(str);
	        // Use StringBuilder's reverse() method to reverse the string
	        sb.reverse();
	        // Convert StringBuilder back to String and return
	        return sb.toString();
	    }
//Write a Java program to implement a simple calculator.
	    public static void implementingASimpleCalculator () {
	    	//creating the instance of scanner class
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter your first number here: ");
	    	double num6 = scanner.nextDouble();
	    	System.out.println("Enter your second number here: ");
	    	double num7 = scanner.nextDouble();
	    	//performing the addition operation 
	    	double sum = num6 + num7;
	    	//Printing the result to the console
	    	System.out.println("The sum of the numbers you entered is: " +sum);
	    	//Closing the scanner class in order to avoid memory links
	    	//scanner.close();  	
	    }

//Write a Java program to convert Fahrenheit to Celsius.
	    public static void convertFahrenheitToCelsius () {
	    	//creating the instance of scanner class
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.println("Enter Fahrenheit temperature here: ");
	    	double fahrenheit = scanner.nextDouble();
	    	//Formula to convert F* to C*
	    	double celsius = (fahrenheit - 32)*5/9;
	    	//Printing the result to the console
	    	System.out.println("The temperature in Celsius is: " +celsius );
	    	scanner.close();    	
	    }
//Write a Java program to generate a random number between 1 and 100.
	    public static void generateRandomNumberFromOneToHundred () {
	    	// Creating the object of Random
	    	Random random = new Random();
	    	int anyNumber = random.nextInt(100)+ 1;
	    	//Printing any number to the console
	    	System.out.println("Any number b/n 1 and 100 could be: " +anyNumber);
	    }
	    
	    
	    
}
			
			
		
		
		
		
		





		

	
	
	
		

