package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
            if (isPrime(n)) {
                answer.append(n).append(" ");
            }
        }
        System.out.println(answer);
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
