package org.example.seolki.section02;
import java.util.*;

public class Problem07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] score = new int[N];
        if(arr[0] == 1){
            score[0] = 1;
        }
        else{
            score[0] = 0;
        }
        for(int i = 1; i < score.length; i++){
            if(arr[i] == 0){
                score[i] = 0;
            }
            else{
                if(arr[i-1] == 1){
                    score[i] += score[i-1] + 1;
                }
                else{
                    score[i] = 1;
                }
            }
        }
        int sum = 0;
        for(int i : score){
            sum += i;
        }
        System.out.println(sum);
    }
}
