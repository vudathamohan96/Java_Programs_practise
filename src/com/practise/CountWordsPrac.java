package com.practise;

import java.util.HashMap;
import java.util.Map;

public class CountWordsPrac {

	public static void main(String[] args) {
		
		String str="I love love java java java";
		str=str.toLowerCase();
		String[] words=str.split(" ");
		int count=1;
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(!map.containsKey(words[i])) {
				map.put(words[i], count);
			}else {
				map.put(words[i],count+1);
			}
		}
		for(String x : map.keySet()) {
			System.out.println("Count of "+ x+" is: "+map.get(x));
		}
	}

}
