package org.example.jackson.section02;

import java.util.Scanner;

public class Problem09 {

    public static int solution(int len, int[][] arr) {
        int answer = 0;
        int sum1, sum2;

        for (int i = 0; i < len; i++) {
            sum1 = sum2 = 0;
            for (int k = 0; k < len; k++) {
                sum1 += arr[i][k]; // 행의 합 -> 행 고정 열 이동
                sum2 += arr[k][i]; // 열의 합 -> 열 고정 행 이동
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < len; i++) { // 대각선
            sum1 += arr[i][i];
            sum2 += arr[i][len - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[][] arr = new int[len][len];

        for (int raw = 0; raw < len; raw++) {
            for (int colum = 0; colum < len; colum++) {
                arr[raw][colum] = scan.nextInt();
            }
        }

        System.out.println(solution(len, arr));

    }
}
