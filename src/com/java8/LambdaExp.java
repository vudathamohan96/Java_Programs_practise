package com.java8;

interface add{
	int addnum(int a,int b);
}
interface name{
	String fname();
}

public class LambdaExp   {
int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Interface 1	
     add sum =(a,b)-> {
	return a+b;
     };
    System.out.println(sum.addnum(10,20));
    
  //Interface 2
    name obj1=()-> {return "Mohan";};
	
	System.out.println(obj1.fname());
	}
}

	


