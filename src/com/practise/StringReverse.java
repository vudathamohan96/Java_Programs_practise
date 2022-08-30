package com.practise;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Welcome";
		char[] str=word.toCharArray();
		String revWord="";
	
		for(int i=word.length()-1;i>=0;i--) {
			revWord=revWord+str[i];
		
		}
		System.out.println(revWord);
	}

}
