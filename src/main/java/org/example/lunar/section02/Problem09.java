package org.example.lunar.section02;

import java.util.*;

public class Problem09 {
    public static int solution(int n, int[][] num){
        int k = n-1, answer = 0;
        int[] row = new int[n];
        int[] col = new int[n];
        int[] diagonal = new int[2];

        for(int i = 0; i < n; i++){
            diagonal[0] += num[i][i];
            diagonal[1] += num[k--][i];
            for(int j = 0; j < n; j++) {
                row[i] += num[i][j];
                col[i] += num[j][i];
            }
        }

        Arrays.sort(row);
        Arrays.sort(col);
        Arrays.sort(diagonal);

        answer = Math.max(row[n-1], col[n-1]);
        answer = Math.max(answer, diagonal[1]);
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
