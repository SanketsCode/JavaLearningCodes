package Arrays;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dayOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saterday"};
		
		String dayWithMostCharacters = "";
		
		for( String day: dayOfWeek) {
			if(day.length() >= dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
			
		}
		
		System.out.println("Day With Most Character - "+dayWithMostCharacters);
		
		for(int i = dayOfWeek.length - 1;i >= 0; i--) {
			System.out.println(dayOfWeek[i]);
		}

	}

}
 