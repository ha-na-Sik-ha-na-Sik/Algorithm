package org.example.jackson.section01;

import java.util.Scanner;

public class Problem03 {

    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] arr = str.split(" ");

        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}
