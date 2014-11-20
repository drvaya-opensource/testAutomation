package test02;

public class PopupHandler {

	public static void main(String[] args) throws InterruptedException {
				
		String strTestMain = "Main";
		
		System.out.println(getCount(strTestMain));
		
	
	}
	
	public static int getCount(String strData){
		
		int i=0;
		
		i = strData.length();
		
		i+=1;
		
		return i;
	}

}
