package broCodeTutorials;

import java.util.Scanner;

public class mathClassesJava {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		double max = Math.max(x,y);
		double min = Math.min(x,y);
		
		double ceil = Math.ceil(x);
		double round = Math.round(x);
		double floor = Math.floor(x);
		
		double abs = Math.abs(y);
		double sqrt = Math.sqrt(y);
		
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);
		
		System.out.println("ceil is : "+ceil);
		System.out.println("round is : "+round);
		System.out.println("floor is : "+floor);
		
		System.out.println("abs is : "+abs);
		System.out.println("sqrt is : "+ sqrt);
		
		System.out.println("Now let's compute the Hypotenuse. Enter the x and y values:");
		
		Scanner keyBoardScanner = new Scanner(System.in);
		
		System.out.println("Enter side1: ");
		
		double side1 = keyBoardScanner.nextDouble();
		
		System.out.println("Enter side2: ");
		
		double side2 = keyBoardScanner.nextDouble();
		
		double side3 = Math.sqrt((side1*side1)+(side2*side2));
		
		System.out.println("The Hypotenuse is: "+ side3);
		
		keyBoardScanner.close();

	}

}
