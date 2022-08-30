package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class GFG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int N=4;
   int A[]= {1,2,3,4};
   int B[]=null;
   int a=0;
   String str=A.toString();
   List<Integer> list=new ArrayList<>();
   for(int i=0;i<N;i++) {
	a= list.get(i)-list.get(i+1);
	 
   }
   
   System.out.println(a);

   
	}

}
