package org.example.lunar.section01;

import java.util.*;

public class Problem03 {
    public static String solution(String sent){
        String[] words = sent.split(" ");
        int max = -1, len = 0;
        String longest = "";

        for(String word : words){
            len = word.length();
            if(len > max){
                max = len;
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String sent = in.nextLine();
        System.out.println(solution(sent));
    }
}
