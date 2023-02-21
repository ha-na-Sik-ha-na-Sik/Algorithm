package org.example.lunar.section02;

import java.util.Scanner;

public class Problem04 {
    public static int[] solution(int n){
        int[] num = new int[n];
        num[0] = num[1] = 1;
        int i = 2;

        while(i < n){
            num[i] = num[i-1] + num[i-2];
            i++;
        }

        return num;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] result = new int[n];
        result = solution(n);
        for(int i : result){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
