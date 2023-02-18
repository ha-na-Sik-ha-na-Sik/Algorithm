package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알게된 점
 * Integer.parseInt(String, <진법 입력 가능>);
 */
public class Problem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine().replace('#', '1').replace('*', '0');
        int offset = s.length() / N;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int start = i * offset;
            String sub = s.substring(start, start + offset);
            answer.append((char) Integer.parseInt(sub, 2));
        }
        System.out.println(answer);
    }
}
