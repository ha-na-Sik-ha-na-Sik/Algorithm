package org.example.lunar.section01;

import java.util.Scanner;

public class Problem01 {
    public static int solution(String str, char ch) {
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        int answer = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char ch = in.next().charAt(0);
        int result = solution(str, ch);
        System.out.println(result);
    }
}
