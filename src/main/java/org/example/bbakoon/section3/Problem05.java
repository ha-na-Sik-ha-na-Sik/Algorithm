package org.example.bbakoon.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int cur = 0;
        int answer = 0;

        int L = 1;
        for (int R = 1; R <= N / 2 + 1; R++) {
            cur += R;
            if (cur == N) {
                answer++;
            }
            while (cur >= N) {
                cur -= L++;
                if (cur == N) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
