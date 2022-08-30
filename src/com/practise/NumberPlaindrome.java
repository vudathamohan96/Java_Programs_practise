package com.practise;

public class NumberPlaindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=12321;
    int rev=0,temp=0;
    temp=num;
    int []a= {1,2,3};
    int l=a.length;
    while(num>0) {
    	rev=rev*10+num%10;
    	num=num/10;
    }
    System.out.println(rev+" "+temp);
    if(temp==rev) {
    	System.out.println(rev+" is a palindrome");
    }else {
    System.out.println(temp+" is not a palindrome");
	}
	}
}
