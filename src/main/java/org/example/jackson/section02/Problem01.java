package org.example.jackson.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {

    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        return answer;
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
