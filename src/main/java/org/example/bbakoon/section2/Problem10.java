package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean isFind = true;
                for (int n = 0; n < 4; n++) {
                    int x = i + dx[n];
                    int y = j + dy[n];
                    if (x < 0 || x >= N || y < 0 || y >= N) continue;
                    if (map[x][y] >= map[i][j]) {
                        isFind = false;
                        break;
                    }
                }
                if (isFind) answer++;
            }
        }
        System.out.println(answer);
    }
}
