package org.example.lunar.section02;

import java.util.Scanner;

public class Problem07 {
    public static int solution(int n, int[] num){
        int cnt = 0, answer = 0;

        for(int i = 0; i < n; i++){
            if(num[i] == 1){
                answer += (++cnt);
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = in.nextInt();
        }
        System.out.println(solution(n, num));
    }
}
