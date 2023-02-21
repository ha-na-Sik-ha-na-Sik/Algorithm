package org.example.jackson.section01;

import java.util.Scanner;

public class Problem11 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer.append(str.charAt(i));
                if (cnt > 1) {
                    answer.append(cnt);
                    cnt = 1;
                }

            }

        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
