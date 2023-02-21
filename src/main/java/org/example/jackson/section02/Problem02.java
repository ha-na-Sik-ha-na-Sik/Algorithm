package org.example.jackson.section02;

import java.util.Scanner;

public class Problem02 {

    public static int solution(int N, int[] arr) {
        int answer = 1, max = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(N, arr));

    }
}
