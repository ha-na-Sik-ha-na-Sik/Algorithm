package org.example.seolki.section02;
import java.util.*;

public class Problem02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int min = 0;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(min < arr[i]){
                min = arr[i];
                cnt ++;
            }
        }
        System.out.print(cnt);
    }
}
