package day01;

public class DataStructures {

	public static void main(String[] args) {

		String[] arrNames = {"Mark S.", "Tom ABCDFEFKJKJ", "John"};
		
//		for (int iCounter=0; iCounter<arrNames.length-1; iCounter++){
//			System.out.println(arrNames[iCounter]);
//		}
		
		//For each element in collection
		for (String strTemp : arrNames){
			
			getStringComparison(strTemp);
			
		}
	
	}
	
	public static void getStringComparison(String strInput){
		
		if(strInput.length() >= 10){
			System.out.println("Long name");
		}
		else if(strInput.length() <= 5){
			System.out.println("Short name");
		}
		else{
			System.out.println("Appropriate !!");
		}		
		
	}

}
