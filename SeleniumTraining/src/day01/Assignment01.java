package day01;

public class Assignment01 {

	public static void main(String[] args) {

		int[] arrNumbers = {1, 2, 3, 4, 98, 99, 100, 101, 0, -1};
		
		//For each element in collection
		for (int iNum : arrNumbers){
			doNumberComparison(iNum);
		}
	}
	
	public static void doNumberComparison(int iInput){
		
		
		if(iInput < 0){
			System.out.println("Negative Value");
		}
		else if(iInput == 0){
			System.out.println("Zero");
		}		
		else if(iInput >= 100){
			System.out.println("Long number");
		}
		else if(iInput < 100){
			System.out.println("Short number");
		}		
	}
}
