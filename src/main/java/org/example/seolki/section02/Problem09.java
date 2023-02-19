package org.example.seolki.section02;
import java.util.*;
public class Problem09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // 행
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr.length; j++){
                sum += arr[i][j];
                ans.add(sum);
                //System.out.println(i + "행 값" + sum);
            }
        }
        // 열
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr.length; j++){
                sum += arr[j][i];
                ans.add(sum);
            }
        }
        // 대각선
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i];
            ans.add(sum);
        }
        sum = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            sum += arr[arr.length -1 -i][i];
            ans.add(sum);
        }
        int max = Collections.max(ans);
        System.out.print(max);
    }
}
