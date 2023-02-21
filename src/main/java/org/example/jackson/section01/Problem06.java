package org.example.jackson.section01;

import java.util.Scanner;

public class Problem06 {

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))  == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
