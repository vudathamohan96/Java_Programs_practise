package com.practise;

import java.util.HashMap;
import java.util.Map;

public class DuplicateLetterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="Regression";
   str=str.toLowerCase();
   char[] c=str.toCharArray();
   Map<Character,Integer> map=new HashMap<Character,Integer>();
   
   for(Character ch: c) {
	   if(map.containsKey(ch)) {
		   map.put(ch, map.get(ch)+1);
	   }else {
		   map.put(ch, 1);
	   }
      }

   //System.out.println(map);
	}

}
