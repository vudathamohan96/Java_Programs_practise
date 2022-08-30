package com.practise;

import java.util.ArrayList;
import java.util.List;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Java is object oriented programming language";
    
	int total_length=str.length();
	int new_length=str.replace("a", "").length();
	
	System.out.println("Total count of a is : "+(total_length-new_length));
	}
}
