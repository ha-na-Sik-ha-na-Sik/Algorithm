package org.example.jackson.section01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

    public static ArrayList<String> solution(String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String str : arr) {
            answer.add(new StringBuilder(str).reverse().toString());
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.next();
        }

        for (String str : solution(arr)) {
            System.out.println(str);
        }
    }
}
