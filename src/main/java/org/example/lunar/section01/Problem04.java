package org.example.lunar.section01;

import java.util.*;

public class Problem04 {
    public static String[] solution(String[] str){
        int i = 0;
        for(String s: str){
            str[i] = new StringBuilder(s).reverse().toString();
            i++;
        }
        return str;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        String[] str = new String[num];
        for(int i = 0; i < num; i++){
            str[i] = in.next();
        }
        str = solution(str);
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
