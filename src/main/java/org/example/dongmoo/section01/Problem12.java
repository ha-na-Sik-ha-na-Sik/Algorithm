package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem12 {
    public static String solution(int n,String s) {
        String str = s.replace("#", "1").replace("*", "0");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            int decimal = Integer.parseInt(str.substring(0, 7), 2);
            answer.append((char) decimal);
            str = str.substring(7);
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(Integer.parseInt(br.readLine()),br.readLine()));
    }
}
