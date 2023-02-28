package org.example.dongmoo.section03;

import java.util.Scanner;

public class Problem04 {
    //연속 부분수열
    public static int solution(int[] nums, int k) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    answer++;
                    break;
                }
                if (sum > k) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, k));
    }
}
