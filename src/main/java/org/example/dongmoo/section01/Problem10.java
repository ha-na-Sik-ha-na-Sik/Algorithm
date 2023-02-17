package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10 {
    public static int[] solution(String s, char t) {
        char[] chars = s.toCharArray();
        int[] answers = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == t) {
                p = 0;
                answers[i] = p;
                continue;

            }
            p++;
            answers[i] = p;
        }

        p = 1000;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == t) {
                p = 0;
                continue;
            }
            p++;
            answers[i] = Math.min(answers[i], p);
        }
        return answers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str = s.substring(0,s.length()-2);
        char t = s.charAt(s.length() - 1);

        int[] solution = solution(str, t);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
