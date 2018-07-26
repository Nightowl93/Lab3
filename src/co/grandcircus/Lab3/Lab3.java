/* Shontinique Uqdah
 * 07/17/2018
 */
package co.grandcircus.Lab3;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		//Declares variables to be used and creates scanner
		Scanner scnr = new Scanner(System.in);
		int userInput;
		String userName;
		char userResponse;
		boolean keepGoing = true;
		
		//Prompts user for their name
		System.out.println("Hello! What is your name?");
		userName = scnr.nextLine();
		
		System.out.println("Welcome " + userName + "! Let's get started." );
			
		//Ensures loop reiterates as long as user wished to continue
		while (keepGoing == true) {
			
			//Prompts user to enter an integer and continues to ask until an acceptable value is entered
			do {
				System.out.println(userName + " please enter an integer between 1 and 100: ");
				userInput = scnr.nextInt();
			}
			while (userInput < 1 || userInput > 100);
			
			//Checks whether user integer is odd
			if (userInput % 2 == 1) {
				
				//Prints response for odd integers greater than 60
				if (userInput > 60) {
					System.out.println(userName + ", your number (" + userInput + ") is Odd and greater than 60.");
				}
				
				//Prints response for odd integers less than 60
				else {
					System.out.println(userName + ", your number (" + userInput + ") is Odd.");
				}
			}
			
			//For anyy even integers entered
			else {
				//Prints response for even integers less than 25
				if (userInput >= 2 && userInput <= 25)
				{
					System.out.println(userName + ", your number" + " is Even and less than 25.");
				}
				
				//Print response for even integers between 26 and 60, inclusive
				else if (userInput > 25 && userInput <= 60) {
					System.out.println(userName + ", your number" + " is Even.");
				}
				
				//Prints response for any even integer greater than 60
				else {
					System.out.println(userName + ", your number (" + userInput + ") is Even.");
				}
			}
			
			//Prompts user to continue checking integers
			System.out.println("Would you like to continue? (y/n)");
			userResponse = scnr.next().charAt(0);
			
			//Ensures process above repeats if user wishes to continue
			if (userResponse == 'y' || userResponse == 'Y')
			{
				keepGoing = true;
			}
			
			//Terminates loop and program if user does not wish to continue
			else {
				keepGoing = false;
				System.out.println("Well " + userName + ", this was fun! Goodbye. :)");
			}
			}
			
		//Closes scanner to avoid memory leaks
		scnr.close();
		
		
	}

}
