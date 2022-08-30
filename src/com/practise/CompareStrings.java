package com.practise;

public class CompareStrings {

	public static void main(String[] args) {
    String str1="contains word";
    String str2="word ias";
    
    System.out.println(compare(str1,str2));
	}

	private static boolean compare(String str1, String str2) {
    
		if(str2.length()>str1.length()) 	{	return false;
		}
			
		if(str2.isEmpty()) {return false;}
		for(int i=0;i<str2.length();i++) {
		if(!str1.contains(String.valueOf(str2.charAt(i)))) {
			return false;
		}
		}
        return true;
	}

}
