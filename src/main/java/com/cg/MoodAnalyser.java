/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

public class MoodAnalyser {
	public String message;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
			if (message.contains("Happy"))
				return "SAD";
			else 
				return "HAPPY";
		}
	}