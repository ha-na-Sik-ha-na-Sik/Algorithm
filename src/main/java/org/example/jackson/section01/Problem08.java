package org.example.jackson.section01;

import java.util.Scanner;

public class Problem08 {

    public static String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^a-zA-Z]", "");
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            char tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            lt++;
            rt--;
        }
        if (Boolean.FALSE.equals(str.equals(String.valueOf(arr)))) return "NO";


        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toUpperCase();
        System.out.println(solution(str));
    }
}
