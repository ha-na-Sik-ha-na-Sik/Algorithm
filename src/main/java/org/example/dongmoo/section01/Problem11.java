package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11 {
    public static String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder answer = new StringBuilder("" + s.charAt(0));
        int cnt = 1;

        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++;
                if (s.length() - 1 == i) {
                    answer.append(cnt);
                }
            } else if (cnt != 1) {
                answer.append(cnt);
                answer.append(chars[i]);
                cnt = 1;
            } else {
                answer.append(chars[i]);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
