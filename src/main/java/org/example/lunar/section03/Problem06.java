package org.example.lunar.section03;

import java.util.Scanner;

public class Problem06 {
    public static int solution(int n, int k, int[] num) {
        int answer = 0, pt1 = 0, pt2 = 0, sum = 0, cnt = 0;

        while(pt1 < n) {
            pt2 = pt1++;
            while(cnt <= k && pt2 < n){
                if(num[pt2] == 1) sum++;
                else if(num[pt2] == 0) {++cnt; sum++;}
                if(cnt == k+1) { break; }
                pt2++;
            }
            if(answer < sum) answer = sum;
            sum = 0;
            cnt = 0;
        }

        return answer-1;
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
