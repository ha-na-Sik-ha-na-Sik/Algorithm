package org.example.jackson.section01;

import java.util.Scanner;

public class Problem10 {

    public static int[] solution(String str, char ch) {
        int length = str.length();
        int[] answer = new int[length];
        int p = 1000;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch) {
                p = 0;
                answer[i] = p;
            } else {
                answer[i] = ++p;
            }
        }

        p = 1000;
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) p = 0;
            else answer[i] = Math.min(answer[i], ++p);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);
        for (int i : solution(str, ch)) {
            System.out.print(i + " ");
        }
    }
}
