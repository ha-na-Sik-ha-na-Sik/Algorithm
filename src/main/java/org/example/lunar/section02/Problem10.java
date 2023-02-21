package org.example.lunar.section02;

import java.util.*;

public class Problem10 {
    public static int solution(int n, int[][] num){
        int answer = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(i < n-1 && num[i][j] <= num[i+1][j]){
                    continue;
                }
                if(i > 0 && num[i][j] <= num[i-1][j]){
                    continue;
                }
                if(j < n-1 && num[i][j] <= num[i][j+1]){
                    continue;
                }
                if(j > 0 && num[i][j] <= num[i][j-1]){
                    continue;
                } else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] num = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                num[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, num));
    }
}
