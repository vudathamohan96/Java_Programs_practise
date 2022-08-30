package com.practise;

//Java Program to find number
//of way to split string such
//that each partition starts
//with distinct character with
//maximum number of partitions.
import java.util.*;
import java.lang.*;
import java.io.*;

class PartitionStrings_Google
{

//Returns the number of we
//can split the string
static int countWays(String s,int N,int M,int K)
{
  
	int count = 0;

	
	for (int i = 0; i <s.length() ;i++) {
		if(s.charAt(i)%2==0 && s.charAt(i+1)%2==1) {
			count++;
		
		}
	}
		
	return count;
}

//Driver Code
public static void main(String ags[])
{
	String s = "232387421";
	int N=9; //length of string
	int M=2; //Minimum length of substring
	int K=3;
	System.out.println(countWays(s,N,M,K));
}
}





