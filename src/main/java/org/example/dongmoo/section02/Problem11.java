package org.example.dongmoo.section02;

import java.util.Scanner;

public class Problem11 {
    //임시반장 정하기
    public static int solution(int n, int[][] info) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (info[i][k] == info[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] info = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                info[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, info));
    }
}
