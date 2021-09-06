package broCodeTutorials;

public class javaSwitch {

	public static void main(String[] args) {
		// switch = statement that allows a variable to be tested for equality against a list of value
		// if you find yourself in a situation to use a lot of "if-elseif-else", then it might be better to use switch. 
		
		String day = "Friday";
		
		switch(day) {
			case "Sunday": System.out.println("It is Sunday!");
        // it is important to have a break after case
        // otherwise, all the following cases will be executed(till break is encountered) if the case holds true.		
			break;
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday!");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thursday": System.out.println("It is Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It is Saturday!");
			break;
        // do the following(default) if none of the above cases hold true.		
			default: System.out.println("That is not a day!");
		}
		
	}

}
