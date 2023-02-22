package org.example.seolki.section02;

import java.util.*;

public class Problem10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N + 2][N + 2];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == 0 || i == arr.length - 1){ // 행 첫번째 or 마지막
                    arr[i][j] = 0;
                }
                else if(j == 0 || j == arr.length - 1){ // 열 첫번째 or 마지막
                    arr[i][j] = 0;
                }
                else {
                    arr[i][j] = sc.nextInt();
                }
            }
        }
        int cnt = 0;
        for(int i = 1; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - 1; j++){
                if((arr[i][j] > arr[i-1][j]) &&  (arr[i][j] > arr[i][j-1]) && (arr[i][j] > arr[i+1][j]) && (arr[i][j] > arr[i][j+1])){
                    cnt ++;
                }
            }
        }
        System.out.print(cnt);
    }
}
