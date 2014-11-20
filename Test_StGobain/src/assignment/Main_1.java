package assignment;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader objFileReader = null;
		String sCurrentLine;
		
		List<String> lstProduct = new ArrayList<String>();		
		objFileReader = new BufferedReader(new FileReader("product.txt"));		
		while ((sCurrentLine = objFileReader.readLine()) != null) {
			lstProduct.add(sCurrentLine);
		}
		
		List<String> lstTweets = new ArrayList<String>();
		objFileReader = new BufferedReader(new FileReader("tweets.txt"));		
		while ((sCurrentLine = objFileReader.readLine()) != null) {
			lstTweets.add(sCurrentLine);
		}
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		Iterator<String> objTweetIterator = lstTweets.iterator();
		while(objTweetIterator.hasNext()){
			String strTweet = objTweetIterator.next();
			
			for(int i=0; i<lstProduct.size(); i++){
				
				String strProduct = lstProduct.get(i).toLowerCase();
				String strPattern = "\\b" + strProduct + "\\b";
				Pattern p = Pattern.compile(strPattern);
			    Matcher m = p.matcher(strTweet.toLowerCase());
			    int count = 0;
			    while (m.find()){
			    	count +=1;
			    }
			    
			    if (wordCount.containsKey(strProduct)) {
			        wordCount.put(strProduct, wordCount.get(strProduct) + count);
			    } else {
			        wordCount.put(strProduct, count);
			    }
			}			
		}
		
		for (Entry<String, Integer> entry: wordCount.entrySet()) {			
		    System.out.println("Count of : " + entry.getKey() + " in sentence = " + entry.getValue());
		}
		
		Map.Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : wordCount.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		System.out.println(maxEntry.getKey());
		
		Map sortedMap = sortByValue(wordCount);
		System.out.println(sortedMap);
		
	}
	
	public static Map sortByValue(Map unsortMap) {	 
		List list = new LinkedList(unsortMap.entrySet());
	 
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
							.compareTo(((Map.Entry) (o2)).getValue());
			}
		});
	 
		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
