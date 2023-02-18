package org.example.seolki.section01;
import java.util.*;

public class Problem04{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String[] arr = sc.next().split("");
        for(int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}