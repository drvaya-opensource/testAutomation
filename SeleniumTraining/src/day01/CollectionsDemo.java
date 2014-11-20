package day01;

import java.util.HashMap;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		/*List<Object> lstNames = new ArrayList<Object>();
		
		lstNames.add("Mark");
		lstNames.add("John");
		lstNames.add("Tom");
		lstNames.add("Harry");
		lstNames.add(1234);
		
		Iterator<Object> itrNames = lstNames.iterator();
		
		while (itrNames.hasNext()){
			System.out.println(itrNames.next());
		}
		
		System.out.println(lstNames);*/
		
		
		HashMap<String, String> mpDetails = new HashMap<String, String>();
		
		mpDetails.put("M1000", "Mark");
		mpDetails.put("M1001", "John");
		mpDetails.put("M1002", "Tom");
		mpDetails.put("M1003", "Harry");
		//mpDetails.put("M1001", "Dominic");
		
		System.out.println(mpDetails);
		System.out.println(mpDetails.keySet());
		System.out.println(mpDetails.values());
		
		System.out.println(mpDetails.get("M1003"));
		
		
	}

}
