package assignment;

/**************************************************
Assignment: Problem 1 for TechX September 2014
Author: Dharmesh Vaya
Date: 13/08/2014
**************************************************/

import java.util.Collections; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	//All file names in the class
	final public static String PRODUCT_FILE = "product.txt";
	final public static String TWEETS_FILE = "tweets.txt";
	final public static String OUTPUT_FILE = "output.txt";
	
	//All data variables
	public static List<String> lstProduct = null;
	public static List<String> lstTweets = null;
	public static List<String> lstOutput = null;
	public static StringBuilder sbResult = null;
	
	public static void main(String[] args) throws IOException {
		
		//instantiate all variables
		lstProduct = new ArrayList<String>();
		lstTweets = new ArrayList<String>();
		lstOutput = new ArrayList<String>();
						
 		//read the input files
		lstProduct = readFileAsList(PRODUCT_FILE);
		lstTweets = readFileAsList(TWEETS_FILE);
		
		//get the tweet count for each product/phrase
		Map<String, Integer> tweetCountMap = getTweetCount();
		
		//get the max tweet value
		int iMaxValueInMap = (Collections.max(tweetCountMap.values())); 
	    for (Entry<String, Integer> entry : tweetCountMap.entrySet()) {
	    	if (entry.getValue() == iMaxValueInMap) {
	    		sbResult = new StringBuilder();
	    		sbResult = sbResult.append(entry.getKey()).append(" ").append(entry.getValue());
	    		lstOutput.add(sbResult.toString());
	        }
	    }
	    
	    if(lstOutput.size() > 0){		   
		    writeResult(lstOutput.get(0));
	    }   
	}
	
	public static void writeResult(String strResult){
		
		File file = new File(OUTPUT_FILE);
		try { 
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter objFileWriter = new FileWriter(file.getAbsoluteFile());
			BufferedWriter objBufferedWriter = new BufferedWriter(objFileWriter);
			objBufferedWriter.write(strResult);
			objBufferedWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> readFileAsList(String strFileName){
		
		BufferedReader objFileReader = null;
		String sCurrentLine = null;
		List<String> lstReturn = new ArrayList<String>();
		
		try{
			objFileReader = new BufferedReader(new FileReader(strFileName));		
			while ((sCurrentLine = objFileReader.readLine()) != null) {
				lstReturn.add(sCurrentLine);
			}			
		}
		catch(IOException objException){
			objException.printStackTrace();
		}
		
		return lstReturn;		
	}
	
	public static Map<String, Integer> getTweetCount(){
		
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		
		Iterator<String> objTweetIterator = lstTweets.iterator();
		while(objTweetIterator.hasNext()){
			String strTweet = objTweetIterator.next();
			
			for(int productCount=0; productCount<lstProduct.size(); productCount++){
				
				String strProduct = lstProduct.get(productCount);
				String strPattern = "\\b" + strProduct.toLowerCase() + "\\b";
				Pattern objPattern = Pattern.compile(strPattern);
			    Matcher objMatcher = objPattern.matcher(strTweet.toLowerCase());
			    int iCount = 0;
			    while (objMatcher.find()) {
			    	iCount+=1;
			    }
			    
			    if (wordCountMap.containsKey(strProduct)) {
			    	wordCountMap.put(strProduct, wordCountMap.get(strProduct) + iCount);
			    }
			    else {
			    	wordCountMap.put(strProduct, iCount);
			    }
			}			
		}
		return wordCountMap;
	}
}
