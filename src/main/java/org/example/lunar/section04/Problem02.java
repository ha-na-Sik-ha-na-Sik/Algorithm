package org.example.lunar.section04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Problem02 {
    public static String solution(String s1, String s2){
        HashMap<Character, Integer> result1 = new HashMap<>();
        HashMap<Character, Integer> result2 = new HashMap<>();
        String answer = "NO";

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(result1.containsKey(ch) == false)
                result1.put(ch, 1);
            else
                result1.put(ch, result1.get(ch)+1);
        }

        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(result2.containsKey(ch) == false)
                result2.put(ch, 1);
            else
                result2.put(ch, result2.get(ch)+1);
        }

        if(result1.equals(result2)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine(); //String
        String s2 = bf.readLine(); //String
        System.out.println(solution(s1, s2));
    }
}
