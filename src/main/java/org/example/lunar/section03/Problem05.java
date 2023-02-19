package org.example.lunar.section03;

import java.util.Scanner;

public class Problem05 {
    public static int solution(int n) {
        int answer = 0, pt1 = 1, pt2 = 0, sum = 0;

        while(pt1 < n) {
            pt2 = pt1++;
            while(sum < n && pt2 < n){
                sum += pt2++;
                if(sum == n) {
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
        System.out.println(solution(n));
    }
}
