package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char c = br.readLine().toLowerCase().charAt(0);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) answer++;
        }
        System.out.println(answer);
    }
}
