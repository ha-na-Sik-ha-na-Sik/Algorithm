package org.example.seolki.section01;

import java.util.*;

public class Problem02{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        // 65<= char <=90이면 대문자, 97<= char <= 122이면 소문자
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char) (arr[i] - 32);
            }
            else{
                arr[i] = (char) (arr[i] + 32);
            }
        }
        System.out.println(arr);
    }
}
