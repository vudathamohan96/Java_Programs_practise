package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String sample="Hello Hello All All Welcome to to my my my Show";
      HashMap<String, Integer> map=new HashMap();
      int count=1;
String [] words=sample.split(" ");
for(String word :words) {
	//System.out.println(word);
	if(map.containsKey(word)) {
		
		map.put(word, map.get(word)+1);
		}else {
		map.put(word, count);
	}
	
}
System.out.println(map);
	}

}
