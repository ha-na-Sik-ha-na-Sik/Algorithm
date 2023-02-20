package org.example.bbakoon.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        int a = 0;
        int b = 0;
        StringBuilder answer = new StringBuilder();
        while (a < n1 || b < n2) {
            if (a == n1) {
                answer.append(B[b++]).append(" ");
            } else if (b == n2) {
                answer.append(A[a++]).append(" ");
            } else if (A[a] <= B[b]) {
                answer.append(A[a++]).append(" ");
            } else {
                answer.append(B[b++]).append(" ");
            }
        }
        System.out.println(answer);
    }
}
