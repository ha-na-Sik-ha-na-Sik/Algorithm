package org.example.lunar.section04;

import java.io.*;
import java.util.*;

public class Problem04 {
    public static int solution(String s1, String s2){
        HashMap<Character, Integer> result1 = new HashMap<>();
        HashMap<Character, Integer> result2 = new HashMap<>();
        int answer = 0, pt1 = 1, pt2 = s2.length();

        for(int i = 0; i < s2.length(); i++) {
            char tmp = s2.charAt(i);
            if(result2.containsKey(tmp) == false)
                result2.put(tmp, 1);
            else
                result2.put(tmp, result2.get(tmp)+1);

            tmp = s1.charAt(i);
            if(result1.containsKey(tmp) == false)
                result1.put(tmp, 1);
            else
                result1.put(tmp, result1.get(tmp)+1);
        }

        while(pt1 <= s1.length()-s2.length()+1){
            if(result1.equals(result2)) answer++;
            if(pt2 >= s1.length()) break;

            char tmp = s1.charAt(pt1-1);
            if(result1.containsKey(tmp) == true) {
                if (result1.get(tmp) < 2) {
                    result1.remove(tmp);
                } else {
                    result1.put(tmp, result1.get(tmp) - 1);
                }
            }

            tmp = s1.charAt(pt2++);
            if(result1.containsKey(tmp) == false)
                result1.put(tmp, 1);
            else
                result1.put(tmp, result1.get(tmp)+1);

            pt1++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        System.out.println(solution(s1, s2));
    }
}
