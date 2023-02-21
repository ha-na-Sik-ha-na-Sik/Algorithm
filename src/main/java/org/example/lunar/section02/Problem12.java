package org.example.lunar.section02;

import java.util.Scanner;

public class Problem12 {
    public static int solution(int r, int c, int[][] num) {
        int answer = 0, cnt = 0, mento = 0, mentee = 0;

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                cnt = 0;
                for(int t = 0; t < r; t++){
                    for(int s = 0; s < c; s++){
                        if(num[t][s] == i+1) mento = s;
                        if(num[t][s] == j+1) mentee = s;
                    }
                    if(mento < mentee) cnt++;
                }
                if(cnt == r){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int r = in.nextInt();
        int[][] num = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                num[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(r, c, num));
    }
}
