package com.practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> numbers=new ArrayList<Integer>();
    Set<Integer> num=new HashSet<Integer>();
    for(int i=0;i<10;i++) {
    	numbers.add(i);
    
    }
    System.out.println(numbers);
	}

}
