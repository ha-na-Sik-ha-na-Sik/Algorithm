package org.example.bbakoon.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int a = 0;
        int b = 0;
        StringBuilder answer = new StringBuilder();
        while (a < N && b < M) {
            if (A[a] < B[b]) {
                a++;
            } else if (A[a] > B[b]) {
                b++;
            } else {
                answer.append(A[a]).append(" ");
                a++;
                b++;
            }
        }
        System.out.println(answer);
    }
}
