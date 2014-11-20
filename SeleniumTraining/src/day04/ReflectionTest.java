package day04;

import java.lang.reflect.Method;
import utilities.UtilLibrary;

public class ReflectionTest {
	
	public static void main(String[] args) {
		ReflectionTest objTest =  new ReflectionTest();
		objTest.testReflection();		
	}
	
	public void testReflection(){
		
	UtilLibrary objLibrary = new UtilLibrary();	
		try{
			Method method[] = objLibrary.getClass().getMethods();
			
			for(int i=0;i<method.length;i++){
				System.out.println(method[i].getName());
				
				if(method[i].getName().equals("test_abc")){
					method[i].invoke(objLibrary, "StGobain");
					//objLibrary.test_abc("Test");
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
