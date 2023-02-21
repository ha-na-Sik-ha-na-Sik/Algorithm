package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알게된 점
 * str.indexOf(str.charAt(i)) == i 일 때 최초 등장하는 character
 */
public class Problem06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        boolean[] alphabet = new boolean[26];
        StringBuilder answer = new StringBuilder();
        for (char c : str) {
            if (!alphabet[c - 'a']) {
                alphabet[c - 'a'] = true;
                answer.append(c);
            }
        }
        System.out.println(answer);
    }
}
