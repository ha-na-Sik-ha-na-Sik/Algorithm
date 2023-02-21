package org.example.jackson.section01;

import java.util.Scanner;

public class Problem02 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if(Character.isUpperCase(ch)) answer.append(Character.toLowerCase(ch));
            else answer.append(Character.toUpperCase(ch));
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
