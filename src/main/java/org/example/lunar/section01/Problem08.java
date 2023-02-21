package org.example.lunar.section01;

import java.util.*;

public class Problem08 {
    public static String solution(String s){
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        String answer = "YES";

        while(left < right && answer == "YES"){
            if(!Character.isAlphabetic(s.charAt(left))) left++;
            else if(!Character.isAlphabetic(s.charAt(right))) right--;
            else if(s.charAt(left) != s.charAt(right)){
                answer = "NO";
            } else{
                left++; right--;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }
}