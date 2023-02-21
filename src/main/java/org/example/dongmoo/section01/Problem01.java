package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem01 {
    public static int solution(String str, char t) {
        return (int) str.toLowerCase().chars()
                .filter(c -> c == t)
                .count();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().toLowerCase().charAt(0);
        System.out.print(solution(str, c));
    }
}
