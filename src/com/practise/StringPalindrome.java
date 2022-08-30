package com.practise;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Madam";
		char[] arr=str.toCharArray();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+arr[i];
		}
		System.out.println(rev);
		if(rev.toLowerCase().equalsIgnoreCase(str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}

	}

}
