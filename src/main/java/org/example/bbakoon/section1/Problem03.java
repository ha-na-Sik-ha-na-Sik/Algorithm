package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        String[] strs = br.readLine().split(" ");
        for (String str : strs) {
            if (str.length() > answer.length()) {
                answer = str;
            }
        }
        System.out.println(answer);
    }
}
