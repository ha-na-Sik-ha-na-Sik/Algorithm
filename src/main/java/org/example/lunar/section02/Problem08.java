package org.example.lunar.section02;

import java.util.*;

public class Problem08 {
    public static int[] solution(int n, int[] num){
        int pt = 0;
        int[] answer = new int[n];

        while(pt < n){
            for(int i = 0; i < n; i++) {
                if (num[pt] < num[i]) {
                    answer[pt]++;
                }
            }
            pt++;
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
        num = solution(n, num);
        for(int i : num){
            System.out.print((i+1)+" ");
        }
    }
}
