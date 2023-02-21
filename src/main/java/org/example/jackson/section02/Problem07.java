package org.example.jackson.section02;

import java.util.Scanner;

public class Problem07 {

    public static int solution(int N, int[] arr) {
        int answer = 0, cnt = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                answer += ++cnt;
            } else {
                cnt = 0;
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
