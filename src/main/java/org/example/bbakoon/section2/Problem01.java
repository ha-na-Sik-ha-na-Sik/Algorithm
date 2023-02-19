package org.example.bbakoon.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sb.append(arr[0]).append(" ");
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
