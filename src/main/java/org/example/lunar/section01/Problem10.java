package org.example.lunar.section01;

import java.util.*;

public class Problem10 {
    public static int[] solution(String s, char ch){
        int i = 0, n = 101;
        int[] cnt1 = new int[s.length()];
        int[] cnt2 = new int[s.length()];

        //자신보다 왼쪽의 ch를 기준으로
        while(i < s.length()){
            if(s.charAt(i) != ch){
                n += 1;
            } else {
                n = 0;
            }
            cnt1[i] = n;
            i++;
        }

        //자신보다 오른쪽의 ch를 기준으로
        n = 101;
        i--;
        while(i >= 0){
            if(s.charAt(i) != ch){
                n += 1;
            } else {
                n = 0;
            }
            cnt2[i] = n;
            i--;
        }

        i = 0;
        while(i < s.length()){
            cnt1[i] = Math.min(cnt1[i], cnt2[i]);
            i++;
        }
        return cnt1;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        char ch = in.next().charAt(0);

        int[] result = solution(s, ch);
        for(int n: result){
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
