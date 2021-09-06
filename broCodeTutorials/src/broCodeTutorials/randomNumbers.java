package broCodeTutorials;

import java.util.Random;

public class randomNumbers {
	public static void main(String[] args) {
		
		Random random = new Random();
		
//		returns random integers (+/- 23^2 possible int values are produced with (approximately) equal probability.)
		int rand1 = random.nextInt();
		System.out.println("Rand1: "+ rand1);
		
//		returns random integers in the interval [0,5]
		int rand2 = random.nextInt(6);	
		System.out.println("Rand2: "+ rand2);
		

//		returns random integers in the interval [1,6]
		int rand3 = random.nextInt(6)+1;	
		System.out.println("Rand3: "+ rand3);

	}
}
