package org.example.jackson.section01;

import java.util.Scanner;

public class Problem07 {

    public static String solution(String str) {
        String answer = "YES";
        if (Boolean.FALSE.equals(str.equals(new StringBuilder(str).reverse().toString()))) return "NO";

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();
        System.out.println(solution(str));
    }
}
