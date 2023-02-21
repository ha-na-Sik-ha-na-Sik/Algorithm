package org.example.lunar.section02;

import java.util.*;

public class Problem11 {
    public static int solution(int n, int[][] num) {
        int answer = 0, max = -1;
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(num[i][k] == num[j][k]){
                        sum[i]++;
                        break;
                    }
                }
            }
                if(max < sum[i]){
                    answer = i;
                    max = sum[i];
                }
        }

        return answer+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] num = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, num));
    }
}
