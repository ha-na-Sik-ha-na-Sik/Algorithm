package org.example.jackson.section01;

import java.util.Scanner;

public class Problem01 {

    public static int solution(String str, char ch) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();
        char ch = scan.next().toUpperCase().charAt(0);
        System.out.println(solution(str, ch));
    }
}
