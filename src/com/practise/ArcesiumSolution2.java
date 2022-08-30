package com.practise;

import java.util.Scanner;

public class ArcesiumSolution2 {
    static int counter=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Solution(str);
System.out.println(counter);
	}

	public static void Solution(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String ss=str.substring(i, j);
				if(isPalindrome(ss)==true) {
					//System.out.println(ss);
				 counter++;
				}
			}
		}
		
	}

	public static boolean isPalindrome(String ss) {
		int i=0;
		int j=ss.length()-1;
		while(i<=j) {
			char ch1=ss.charAt(i);
			char ch2=ss.charAt(j);
			if(ch1!=ch2) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		
		
		return true;
	}

}
