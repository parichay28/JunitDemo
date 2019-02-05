package com.qainfoteh.mavenProject;

import java.util.ArrayList;

public class ConsecutiveLetters {
	
	public ArrayList<String> getWords(ArrayList<String> inputWords){
		ArrayList<String> finalWords = new ArrayList<String>();
		int counter;
		
		for(String word: inputWords) {
			
			for(counter=1;counter<word.length();counter++) {
				
				if(word.charAt(counter-1) == word.charAt(counter)){
					finalWords.add(word);
					break;
				}
				
			}
		
		}
		
		return finalWords;
	}

}
