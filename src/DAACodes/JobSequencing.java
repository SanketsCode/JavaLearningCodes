package DAACodes;

public class JobSequencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//1 Create an Input 
		int[] profits = {20,15,10,5,1};
		int[] deadline = {2,2,1,3,3};
		int ans = 0;
		int big = 0;
		
		
		//check the biggest deadline
		for(int value : deadline) {
			if(value > big) {
				big = value;
			}
		}
		
		
		
		//create empty array for storing profits
		int[] deadlineValues = new int[big];
		
		//2 Check the dead line with its slot
		
		for(int i=0;i < profits.length;i++) {
			int check = deadline[i];
			if(deadlineValues[check-1] == 0) {
				deadlineValues[check-1] = profits[i];
			}else {
				for(int j=check-1;j >= 0;j--) {
					if(deadlineValues[j] == 0) {
						deadlineValues[j] = profits[i];
						break;
					}
				}
			}
		}
		
		for (int value : deadlineValues) {
			ans += value;
		}
		
		System.out.println("Total Profit is - "+ans);
		
		//3  adding all profit
	}

}
