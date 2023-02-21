package org.example.jackson.section02;

import java.util.Scanner;

public class Problem05 {

    public static int solution(int N) {
        int answer = 0;
        int[] arr = new int[N + 1];
        for (int i = 2; i <= N; i++) { // 2부터 N까지
            if (arr[i] == 0) {
                answer++;
                for (int k = i; k <= N; k += i) { // i의 배수를 다 1로 변경
                    arr[k] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        System.out.println(solution(N));

    }
}
