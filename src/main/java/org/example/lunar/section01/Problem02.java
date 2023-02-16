package org.example.lunar.section01;

import java.util.*;

public class Problem02 {
    public static String solution(String s){
        char tmp;
        String new_s = "";

        for(int i = 0; i < s.length(); i++){
            tmp = s.charAt(i);
            if(Character.isUpperCase(tmp) == true)
                new_s += Character.toLowerCase(s.charAt(i));
            else
                new_s += Character.toUpperCase(s.charAt(i));
        }

        return new_s;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        String result = solution(input);
        System.out.println(result);
    }
}
