package org.example.jackson.section02;

import java.util.Scanner;

public class Problem07 {

    public static int[] solution(int N, int[] arr) {
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int k = 0; k < N; k++) {
                if (arr[k] > arr[i]) rank++;
            }
            answer[i] = rank;
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
