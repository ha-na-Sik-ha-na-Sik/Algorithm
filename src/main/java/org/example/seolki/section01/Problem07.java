package org.example.seolki.section01;
import java.util.*;

public class Problem07{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char[] arr = str.toCharArray();
        int mid = (arr.length / 2);
        String ans = "";
        for(int i = 0; i < mid; i++){
            if(arr[i] != arr[arr.length-1-i]){
            ans = "NO";
            break;
        }
        else{
            ans = "YES";
            }
        }
        System.out.println(ans);
    }
}
