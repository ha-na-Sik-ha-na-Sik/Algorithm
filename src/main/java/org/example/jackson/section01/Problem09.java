package org.example.jackson.section01;

import java.util.Scanner;

public class Problem09 {

    public static int solution(String str) {
        str = str.replaceAll("[^0-9]", "");

        return Integer.parseInt(str);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toUpperCase();
        System.out.println(solution(str));
    }
}
