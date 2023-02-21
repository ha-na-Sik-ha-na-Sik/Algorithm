package org.example.jackson.section02;

import java.util.Scanner;

public class Problem11 {

    public static int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int k = 1; k <= n; k++) {
                for (int j = 1; j <= 5; j++) {
                    if (arr[i][j] == arr[k][j]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 5; k++) {
                arr[i][k] = scan.nextInt();
            }
        }
        System.out.println(solution(n, arr));


    }
}
