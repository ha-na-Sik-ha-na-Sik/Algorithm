package org.example.seolki.section02;
import java.util.*;

public class Problem03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(A[i] == 3){
                if(B[i] == 1) {
                    System.out.println("B");
                }
                else if(B[i] == 2){
                    System.out.println("A");
                }
                else{
                    System.out.println("D");
                }
            }
            else if(A[i] == 2){
                if(B[i] == 1) {
                    System.out.println("A");
                }
                else if(B[i] == 3){
                    System.out.println("B");
                }
                else{
                    System.out.println("D");
                }
            }
            else if(A[i] == 1){
                if(B[i] == 2) {
                    System.out.println("B");
                }
                else if(B[i] == 3){
                    System.out.println("A");
                }
                else{
                    System.out.println("D");
                }
            }
        }
    }
}
