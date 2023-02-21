package org.example.bbakoon.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int L = 0;
        int max = 0;
        int cnt = 0;
        for (int R = 0; R < N; R++) {
            if (arr[R] == 0) {
                cnt++;
            }
            while (cnt > K) {
                if (arr[L] == 0) cnt--;
                L++;
            }
            max = Math.max(max, R - L + 1);
        }
        System.out.println(max);
    }
}
