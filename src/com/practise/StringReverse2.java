package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringReverse2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="welcome to java";
    String output="";
    String w="";
    String []words=str.split(" ");
    //method -1
    for(String word:words) {
    	String reverseWord="";
    	for(int i=word.length()-1;i>=0;i--) {
    		reverseWord=reverseWord+word.charAt(i);
    	}
    	output=reverseWord+" ";
    	System.out.print(output);
    }
    //method-2
    for(int i=str.length()-1;i>=0;i--) {
    	w=w+str.charAt(i);
    }System.out.print(w+" ");
  
}
}