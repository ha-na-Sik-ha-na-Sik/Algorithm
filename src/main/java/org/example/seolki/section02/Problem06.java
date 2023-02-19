package org.example.seolki.section02;
import java.util.*;

public class Problem06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> newarr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            int reverse = 0;
            while(arr[i] != 0) {
                int digit = arr[i] % 10;
                reverse = reverse * 10 + digit;
                arr[i] /= 10;
            }
            arr[i] = reverse;
        }
        int cnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 1; j <= Math.sqrt(arr[i]);j++){
                if(arr[i] % j == 0){
                    cnt++;
                }
            }
            if(cnt == 1 && arr[i] != 1){
                newarr.add(arr[i]);
            }
            cnt = 0;
        }
        for(int i : newarr){
            System.out.print(i + " ");
        }
    }
}
