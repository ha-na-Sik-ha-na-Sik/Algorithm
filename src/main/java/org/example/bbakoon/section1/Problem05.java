package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] answer = br.readLine().toCharArray();
        int L = 0;
        int R = answer.length - 1;
        while (L < R) {
            while (!Character.isAlphabetic(answer[L])) {
                L++;
            }
            while (!Character.isAlphabetic(answer[R])) {
                R--;
            }
            char tmp = answer[L];
            answer[L] = answer[R];
            answer[R] = tmp;
            L++;
            R--;
        }
        System.out.println(answer);
    }
}
