package org.example.lunar.section03;

import java.util.Scanner;

public class Problem04 {
    public static int solution(int n, int m, int[] num) {
        int answer = 0, pt1 = 0, pt2 = 0, sum = 0;

        while(pt1 < n) {
            pt2 = pt1++;
            while(sum < m && pt2 < n){
                sum += num[pt2++];
                if(sum == m) {
                    answer++;
                    break;
                }
            }
            sum = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        System.out.println(solution(n, m, num));
    }
}
