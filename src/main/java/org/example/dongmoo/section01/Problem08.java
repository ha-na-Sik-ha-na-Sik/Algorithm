package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem08 {
    public static String solution(String s) {
        String answer = "YES";
        s = s.toLowerCase().replaceAll("[^a-z]","");
        String temp = new StringBuilder(s).reverse().toString();
        if (!s.equals(temp)) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
