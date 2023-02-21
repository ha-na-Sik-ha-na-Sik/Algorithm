package org.example.lunar.section01;

import java.util.*;

public class Problem09 {
    public static String solution(String s){
        s = s.toLowerCase();
        int i = 0;

        String num = "";
        while(i < s.length()){
            if(!(Character.isAlphabetic(s.charAt(i))) && !(num + s.charAt(i)).equals("0")) num += s.charAt(i);
            i++;
        }

        return num;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}