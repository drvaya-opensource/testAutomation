package studentDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class A{
	
	static ArrayList<Integer> indexOfAll(Object obj, ArrayList<Integer> list){
	    ArrayList<Integer> indexList = new ArrayList<Integer>();
	    for (int i = 0; i < list.size(); i++)
	        if(obj.equals(list.get(i)))
	            indexList.add(i);
	    return indexList;
	}
	
    public static void main(String[] args){
    	
    	ArrayList<Integer> objInteger = new ArrayList<Integer>();
    	
    	objInteger.add(1);
    	objInteger.add(2);
    	objInteger.add(1);
    	objInteger.add(3);
    	objInteger.add(3);
    	objInteger.add(2);
    	objInteger.add(4);
    	
    	HashMap<Integer, ArrayList<Integer>> objIndexedMap = new HashMap<Integer, ArrayList<Integer>>();
    	Iterator<Integer> itr = objInteger.iterator();
    	while(itr.hasNext()){    		
    	
    		int i = (Integer) itr.next();    		
    		objIndexedMap.put(i, indexOfAll(i, objInteger));
    		
    	}
    	
    	System.out.println(objIndexedMap);
    }
    
}

