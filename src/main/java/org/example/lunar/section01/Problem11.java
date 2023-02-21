package org.example.lunar.section01;

import java.util.*;

public class Problem11 {
    public static String solution(String s){
        String new_s = "";
        int cnt = 1;

        for(int i = 0; i < s.length(); i++){
            if(new_s.equals("") || s.charAt(i) != new_s.charAt(new_s.length()-1)){
                if(cnt != 1){
                    new_s += cnt;
                    cnt = 1;
                }
                new_s += s.charAt(i);
            } else if ( s.charAt(i) == new_s.charAt(new_s.length()-1)){
                cnt++;
            }
        }

        new_s += cnt;
        return new_s;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();

        String result = solution(s);
        System.out.println(result);
    }
}