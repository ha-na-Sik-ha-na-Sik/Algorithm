package org.example.jackson.section01;

import java.util.Scanner;

public class Problem05 {

    public static String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))) {
                char tmp = str.charAt(lt);
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            } else if (!Character.isAlphabetic(arr[lt])) lt++;
            else rt--;
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
