package org.example.lunar.section03;

import java.util.Scanner;

public class Problem03 {
    public static int solution(int n, int k, int[] num) {
        int answer = 0, pt1 = 0, pt2 = 0,  sum = 0;;

        /*
        ID5 Time Limit Exceeded
        while(pt1 < n-k){
            int sum = 0;
            pt2 = pt1;
            while(pt2 < pt1+k){
                sum += num[pt2++];
            }
            if(sum > answer){
                answer = sum;
            }
            pt1++;
        }
        */

        while(pt2 < k){
            sum += num[pt2++];
        }

        while(pt1 < n-k && pt2 < n){
            if(sum > answer){
                answer = sum;
            }
            sum -= num[pt1++];
            sum += num[pt2++];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        System.out.println(solution(n, k, num));
    }
}
