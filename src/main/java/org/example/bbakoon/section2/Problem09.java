package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 대각선
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < N; i++) {
            sum1 += map[i][i];
            sum2 += map[N - i - 1][i];
        }
        int answer = Math.max(sum1, sum2);

        // 행, 열
        for (int j = 0; j < N; j++) {
            sum1 = 0;
            sum2 = 0;
            for (int i = 0; i < N; i++) {
                sum1 += map[i][j];
                sum2 += map[j][i];
            }
            answer = Math.max(answer, Math.max(sum1, sum2));
        }
        System.out.println(answer);
    }
}
