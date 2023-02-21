package org.example.lunar.section01;

import java.util.*;

public class Problem06 {
    public static String solution(String s){
        String s2 = "";
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == i){
                s2 += s.charAt(i);
            }
        }
        return s2;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}