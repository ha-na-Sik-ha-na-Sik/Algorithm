package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] check = new int[N + 1];
        int answer = 0;
        for (int i = 2; i <= N; i++) {
            if (check[i] == 0) {
                answer++;
                for (int j = i; j <= N; j += i) {
                    check[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
