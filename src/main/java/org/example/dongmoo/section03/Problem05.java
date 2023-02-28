package org.example.dongmoo.section03;

import java.util.Scanner;

public class Problem05 {
    //연속된 자연수의 합
    public static int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num / 2; i++) {
            int sum = 0;
            for (int j = i; j < num; j++) {
                sum += j;
                if (sum > num) {
                    break;
                }
                if (sum == num) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
