package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (A[i] - B[i] == 1 || A[i] - B[i] == -2) {
                answer.append("A\n");
            } else if (A[i] == B[i]) {
                answer.append("D\n");
            } else {
                answer.append("B\n");
            }
        }
        System.out.println(answer);
    }
}
