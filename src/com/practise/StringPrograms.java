package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPrograms {

	public static void main(String[] args) {
	
		//split string program GFG
		String str6="Geeks@For@Geeks";
		String [] split=str6.split("F");
		Arrays.toString(split);
		for(String a:split) {
			System.out.println(a);
		}
		
	//program shows you how to convert an array to string.
		String []str1= {"hello","Hi"};
		String word=Arrays.toString(str1);
		System.out.println(word);
		
	//two strings are the same ignoring their cases
		String str2="Hello";
		String str3="Hello";
		if(str2.toLowerCase().equalsIgnoreCase(str3.toLowerCase())) {
			System.out.println("Both strings are equal");
		}else {
			System.out.println("Both strings are not equal");	
		}

		//print duplicate characters from the string
		String str4="I love java";
		str4=str4.toLowerCase();
		str4=str4.replace(" ", "");
		List<Character> list=new ArrayList<>();
		List<Character> Dup=new ArrayList<>();
		for(int i=0;i<str4.length();i++) {
			
			if(!list.contains(str4.charAt(i))) {
				list.add(str4.charAt(i));
			}else {
				Dup.add(str4.charAt(i));
			}
		}
		System.out.println("Duplicate characters are: "+Dup);
		
		//swap two strings without using the third variable
		
		String first="one";
		String second="two";
		
		first=first+second;
		second=first.substring(0, (first.length()-second.length()));
		first=first.substring(second.length());
		
		System.out.println("first is "+first + " Second is "+ second);
		
    //to reverse the words from the given string sentence
		
	String inputString="Arise! Awake! and stop not until the goal is reached";
	String[] words=inputString.split("\\s+");
	String reverseString="";
	for(String word1 :words) {
		reverseString=reverseString+Reverse(word1)+" ";
		
	}
	System.out.println(reverseString);
	}

	private static String Reverse(String word1) {
		// TODO Auto-generated method stub
		String temp="";
	for(int i=word1.length()-1;i>=0;i--) {
		temp=temp+word1.charAt(i);
	}
		return temp;
		
	}
	
			

}

