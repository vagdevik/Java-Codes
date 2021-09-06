package broCodeTutorials;

import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
				//
				//						&& = (AND) both conditions must be true
				// 						|| = (OR) either condition must be true
				//						! = (NOT) reverses boolean value of condition

		// -------------------------------- Example 1: Usage of AND(&&) Logical Operator --------------------------------
		
				System.out.println("-------------------------------- Example 1 --------------------------------");
		
				int temp = 15;
				
				System.out.println("Temperature is: "+ temp);
				
				if(temp>30) {
					System.out.println("It is hot outside");
				}
				else if(temp>=20 && temp<=30) {
					System.out.println("It is warm outside");
				}
				else {
					System.out.println("It is cold outside");
				}

		
		// -------------------------------- Example 2: Usage of OR(||) Logical Operator --------------------------------
				
				System.out.println("-------------------------------- Example 2 --------------------------------");
		
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("You are playing a game! Press q or Q to quit");
				String response = scanner.next();
				
				if(response.equals("q") || response.equals("Q")) {
					System.out.println("You quit the game");
				}
				else {
					System.out.println("YOu are still playing the game *pew pew*");
				}
				
		// -------------------------------- Example 3: Usage of NOT(!) Logical Operator --------------------------------
				
				System.out.println("-------------------------------- Example 3 --------------------------------");
						
				System.out.println("You are playing a game! Press q or Q to quit");
				
				response = scanner.next();
				
				if(!response.equals("q") && !response.equals("Q")) {
					System.out.println("YOu are still playing the game *pew pew*");
				}
				else {
					System.out.println("You quit the game");
				}

	}

}
