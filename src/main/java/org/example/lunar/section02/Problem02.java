package org.example.lunar.section02;

import java.util.Scanner;

public class Problem02 {
    public static int solution(int[] num, int n){
        int i = 1, cnt = 1, max = num[0];

        while(i < n){
            if(max < num[i]){
                ++cnt;
                max = num[i];
            }
            i++;
        }

        return cnt;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = in.nextInt();
        }
        System.out.println(solution(num, n));
    }
}
