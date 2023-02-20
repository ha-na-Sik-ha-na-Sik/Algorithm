package org.example.jackson.section01;

import java.util.Scanner;

public class Problem12 {

    public static String solution(int N, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String substring = str.substring(0, 7).replace("#", "1").replace("*", "0");
            answer.append((char) Integer.parseInt(substring, 2));
            str = str.substring(7);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();

        System.out.println(solution(N, str));

    }
}
