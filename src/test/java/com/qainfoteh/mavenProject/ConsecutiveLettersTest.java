package com.qainfoteh.mavenProject;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;
public class ConsecutiveLettersTest {
	
	@Test
	public void testConsecutiveLetters() {
		ConsecutiveLetters checkWords = new ConsecutiveLetters();
		
		ArrayList<String> inputWords = new ArrayList<String>();
		inputWords.add("hello");
		inputWords.add("bellow");
		inputWords.add("winter");
		
		ArrayList<String> expectedWords = new ArrayList<String>();
		expectedWords.add("hello");
		expectedWords.add("bellow");

		
		ArrayList<String> actualWords = checkWords.getWords(inputWords); 
		assertEquals(expectedWords, actualWords);
		
	}

}
