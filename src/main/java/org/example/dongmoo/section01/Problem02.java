package org.example.dongmoo.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem02 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(str.split(""))
                .forEach(s -> {
                    char alphabet = s.charAt(0);
                    if(Character.isLowerCase(alphabet)){
                        sb.append(Character.toUpperCase(alphabet));
                    } else {
                        sb.append(Character.toLowerCase(alphabet));
                    }
                });
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
