package org.example.lunar.section02;

import java.util.Scanner;

public class Problem06 {
    public static int[] solution(int n, int[] num){
        int[] tmp = new int[n];
        int[] decimal  = new int[n];
        int k = 0;

        while(k < num.length){
            while(num[k] != 0){
                tmp[k] = tmp[k] * 10 + num[k] % 10;
                num[k] /= 10;
            }
            k++;
        }

        k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 2; j <= tmp[i]; j++){
                if (tmp[i] % j == 0 && tmp[i] != j) {
                    break;
                }
                if (tmp[i] % j == 0 && tmp[i] == j) {
                    decimal[k] = tmp[i];
                    k++;
                }
            }
        }

        return decimal;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = in.nextInt();
        }

        int[] result = solution(n, num);
        for(int i : result){
            if(i != 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
