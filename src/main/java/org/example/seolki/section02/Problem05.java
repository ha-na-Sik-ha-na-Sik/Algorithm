package org.example.seolki.section02;
import java.util.*;

public class Problem05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int ans = 0;
        for(int i = 2; i < N; i++){
            for(int j = 1; j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 1){
                ans++;
            }
            cnt = 0;
        }
        System.out.print(ans);
    }
}
