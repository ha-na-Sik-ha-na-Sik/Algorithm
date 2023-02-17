package org.example.lunar.section02;

import java.util.Scanner;

public class Problem03 {
    public static char[] solution(int[] A, int[] B, int n){
        int i = 0;
        char[] result = new char[n];

        while(i < n){
            if((A[i] == 1 && B[i] ==3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)){
                result[i] = 'A';
            } else if((B[i] == 1 && A[i] ==3) || (B[i] == 2 && A[i] == 1) || (B[i] == 3 && A[i] == 2)){
                result[i] = 'B';
            } else {
                result[i] = 'D';
            }
            i++;
        }

        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            B[i] = in.nextInt();
        }

        char[] answer = solution(A, B, n);
        for(char ch: answer){
            System.out.println(ch);
        }
    }
}
