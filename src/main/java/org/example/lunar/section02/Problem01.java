package org.example.lunar.section02;

import java.util.Scanner;

public class Problem01 {
    public static int[] solution(int[] num, int n){
        int[] num2 = new int[n];
        int i = 0, j = 1;

        num2[0] = num[0];
        while(i < n-1){
            if(num[i] < num[i+1]){
                num2[j] = num[i+1];
                j++;
            }
            i++;
        }

        return num2;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = in.nextInt();
        }
        num = solution(num, n);
        for(int i : num) {
            if(i != 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
