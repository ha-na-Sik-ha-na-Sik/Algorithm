package org.example.jackson.section02;

import java.util.Scanner;

public class Problem04 {

    public static int[] solution(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < N; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i : solution(N)) {
            System.out.print(i + " ");
        }

    }
}
