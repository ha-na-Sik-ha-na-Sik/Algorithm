package org.example.dongmoo.section01;

import java.util.*;
import java.io.*;

public class Problem05 {
    public static String solution(char[] chars) {
        int lt = 0;
        int rt = chars.length -1 ;
        while (lt < rt) {
            if (Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            } else if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else {
                rt--;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = solution(str.toCharArray());
        System.out.println(answer);
    }
}
