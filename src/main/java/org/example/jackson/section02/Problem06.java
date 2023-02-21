package org.example.jackson.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem06 {

    public static ArrayList<Integer> solution(int N, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tmp = arr[i];
            tmp = Integer.parseInt(new StringBuilder(String.valueOf(tmp)).reverse().toString());

            if (isPrime(tmp)) answer.add(tmp);
        }
        return answer;
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i : solution(N, arr)) {
            System.out.print(i + " ");
        }

    }
}
