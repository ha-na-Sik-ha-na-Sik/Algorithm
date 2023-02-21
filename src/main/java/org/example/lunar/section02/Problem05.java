package org.example.lunar.section02;

import java.util.Scanner;

public class Problem05 {
    public static int solution(int n){
        int[] num = new int[n];
        int cnt = 0;

        for(int i = 2; i <= n; i++){
            if(num[i-1] == 0){
                cnt++;
                for(int j = i; j <= n; j+=i){
                        num[j-1]++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int result = solution(n);
        System.out.print(result);
    }
}
