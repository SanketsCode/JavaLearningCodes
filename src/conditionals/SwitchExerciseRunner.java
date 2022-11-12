package conditionals;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determineNameOfDay(0));

	}
	
	public static String determineNameOfDay(int dayNumber) {
		switch(dayNumber) {
		case 0:
			return "sunday";
		case 1:
			return "monday";
		case 2:
			return "tuesday";
		case 3:
			return "wednsday";
		case 4:
			return "thursday";
		case 5: 
			return "friday";
		case 6:
			return "saterday";
		default:
			return "Week Day";
		}
		
	}

}
