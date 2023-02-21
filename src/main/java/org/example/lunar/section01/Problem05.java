package org.example.lunar.section01;

import java.util.*;

public class Problem05 {
    public static String solution(String s){
        int i = 0;
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;

        while(left < right){
            if(!Character.isAlphabetic(ch[left])) left++;
            else if(!Character.isAlphabetic(ch[right])) right--;
            else {
                char tmp = ch[right];
                ch[right] = ch[left];
                ch[left] = tmp;
                left++; right--;
            }
        }

        s = "";
        for(char c : ch){
            s += c;
        }

        return s;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}