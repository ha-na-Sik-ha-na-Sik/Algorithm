package org.example.lunar.section01;

import java.util.*;

public class Problem07 {
    public static String solution(String s){
        String answer = "YES";
        int left = 0, right = s.length()-1;
        s = s.toLowerCase();

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                answer = "NO";
                break;
            }
            left++; right--;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}
