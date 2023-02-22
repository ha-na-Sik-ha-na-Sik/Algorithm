package org.example.seolki.section02;
import java.util.*;

public class Problem04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();
        arr[0] = 1;
        arr[1] = 1;
        sb.append(arr[0] + " ");
        sb.append(arr[1] + " ");
        for(int i = 2; i < N; i++){
            arr[i] += arr[i - 1] + arr[i - 2];
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
    }
}
