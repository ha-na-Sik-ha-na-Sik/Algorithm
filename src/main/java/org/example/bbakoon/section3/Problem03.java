package org.example.bbakoon.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cur = 0;
        for (int i = 0; i < K; i++) {
            cur += arr[i];
        }
        int answer = cur;
        for (int i = K; i < N; i++) {
            cur += (arr[i] - arr[i - K]);
            answer = Math.max(answer, cur);
        }
        System.out.println(answer);
    }
}
