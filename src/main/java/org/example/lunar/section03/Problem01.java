package org.example.lunar.section03;

import java.util.Scanner;

public class Problem01 {
    public static int[] solution(int n1, int n2, int[] num1, int[] num2) {
        int i = 0, pt1 = 0, pt2 = 0;
        int[] answer = new int[n1 + n2];

        while (pt1 < n1 && pt2 < n2) {
            if (num1[pt1] <= num2[pt2]) {
                answer[i++] = num1[pt1++];
            } else if (num1[pt1] > num2[pt2]) {
                answer[i++] = num2[pt2++];
            }

        }

        while (pt1 < n1) {
            answer[i++] = num1[pt1++];
        }
        while (pt2 < n2) {
            answer[i++] = num2[pt2++];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] num1 = new int[n1];
        for (int i = 0; i < n1; i++) num1[i] = in.nextInt();
        int n2 = in.nextInt();
        int[] num2 = new int[n2];
        for (int i = 0; i < n2; i++) num2[i] = in.nextInt();

        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(solution(n1, n2, num1, num2)[i] + " ");
        }
    }
}
