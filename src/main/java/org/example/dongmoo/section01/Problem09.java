package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem09 {
    public static int solution(String s) {
        s = s.replaceAll("[^0-9]", "");
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
