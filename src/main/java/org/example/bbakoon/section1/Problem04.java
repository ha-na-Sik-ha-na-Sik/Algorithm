package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            StringBuilder sb = new StringBuilder(br.readLine()).reverse();
            System.out.println(sb);
        }
    }
}
