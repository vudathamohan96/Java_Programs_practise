package com.practise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ArcesiumSolution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
       in.nextLine();
        String magazine[] = in.nextLine().split(" ");
        String note[] = in.nextLine().split(" ");
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(int i=0;i<m;i++){
            if(hm.containsKey(magazine[i])){
                hm.put(magazine[i],hm.get(magazine[i])+1);
            }
            else
                hm.put(magazine[i],1);
                
        }
        
        boolean check=false;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(note[i]))
                check=true;
            else{
                if(hm.get(note[i])>1)
                    hm.put(note[i],hm.get(note[i])-1);
                else
                    hm.remove(note[i]);
            }
        }
        if(!check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
