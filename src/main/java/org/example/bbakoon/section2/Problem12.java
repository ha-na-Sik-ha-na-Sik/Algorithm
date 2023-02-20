package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] result = new int[N + 1][M];

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            for (int rank = 0; rank < N; rank++) {
                int student = Integer.parseInt(st.nextToken());
                result[student][t] = rank;
            }
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                boolean isMento = true;
                for (int t = 0; t < M; t++) {
                    if (result[i][t] <= result[j][t]) {
                        isMento = false;
                        break;
                    }
                }
                if (isMento) answer++;
            }
        }
        System.out.println(answer);
    }
}
