package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem03 {
    public static String solution(String str) {
        String answer = "";
        String[] strs = str.split(" ");
        for (String s : strs) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println(solution(s));
    }
}
