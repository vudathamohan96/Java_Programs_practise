package com.practise;

public class RemoveSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sub53od73th&*$#@";
str=str.replaceAll("[^a-zA-Z0-9]","");
System.out.println(str);
	}

}
