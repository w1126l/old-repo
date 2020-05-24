/* This class will contain a main method and handle interactions with the user.
 * Author: Winnie Liang
 * Date: 10/10/18
 * Last Changed: allowed for user input of quit
 */

import java.util.*; // Allowing user input.


public class QuadraticClient {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in); // Opening the scanner.
		
		Boolean quit = false;
		
		System.out.println("Welcome to the Quadratic Describer!"); 
		System.out.println(""); // Introduction to program.
		System.out.println("This program will accept the coefficients of a quadratic function and return to the \nuser a description of the graph, including the direction the graph opens, the vertex, ");
		System.out.println("and the x-axis intecepts.");
		System.out.println(""); // Description of the purpose of the program.
		System.out.println("Please provide coefficients for the standard form of your quadradic equation.");
		System.out.println(""); // Prompting user for information.
		System.out.println("Standard form for quadratic equation: ax^(2) + bx + c");
					
		do {
			System.out.print("What is your a, b, and c? ");
			System.out.println("Please type your numbers out with ONLY SPACES in between each number.");
			System.out.println(""); // Prompting user for information.
				
			double a = userInput.nextDouble(); // Accepting first coefficient.
			double b = userInput.nextDouble(); // Accepting second coefficient.
			double c = userInput.nextDouble(); // Accepting third coefficient.
				
			if (a == 0) {	
				
				System.out.println("");
				System.out.println("This is not a quadratic equation."); // Printing out when a = 0 and it's not a quadratic equation.
				
			} else {
					
				System.out.println("");
				System.out.println("Your coefficents are:");
				System.out.println("");
				System.out.println("a = " + a); // Printing first coefficient for the user to check.
				System.out.println("b = " + b); // Printing second coefficient for the user to check.
				System.out.println("c = " + c); // Printing third coefficient for the user to check.
					
				System.out.println(""); // Just to make it look neater :).
						
				System.out.println(Quadratic.quadDescriber(a, b, c)); // Printing the description of the equation's graph.
					
				System.out.println("Done!"); // Telling user the program is done.
					
			}
				
			System.out.println("");
			System.out.println("Would you like to quit this program?");
			System.out.println("Please type \"quit\" if you would like to end the program.");
			System.out.println("If you do not wish to quit this program and would like to describe another quadratic, please type \"again\".");
			System.out.println("");
			
			String finished = userInput.next();
			char quitKeword = finished.charAt(0);
			if (quitKeword == 'q') {
				quit = true;
				userInput.close();
					
			}
		
		} while (quit == false);
	
	}
	
}