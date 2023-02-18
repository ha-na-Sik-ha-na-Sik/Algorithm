package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        for (int i = 0; i < str.length; i++) {
            /*
             * 알게된 점
             * Character.isLowerCase(c)
             * Character.toUppserCase(c)
             */
            if ('A' <= str[i] && str[i] <= 'Z') {
                str[i] += 32;
            } else {
                str[i] -= 32;
            }
        }
        System.out.println(str);
    }
}
