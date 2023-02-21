package org.example.lunar.section01;

import java.util.*;

public class Problem12 {
    public static char[] solution(int num, String s){
        int i = 0;
        String[] tmp = new String[num]; Arrays.fill(tmp, "");
        char[] ch = new char[num];

        for(int j = 0; j <= num*7; j++){
            if(tmp[i].length() % 7 == 0 && j != 0){
                //2진수 -> 10진수
                int decimal = Integer.parseInt(tmp[i], 2);
                ch[i] = (char) decimal;
                if(j == num*7) break;
                i++;
            }
            if(s.charAt(j) == '#')
                tmp[i] += 1;
            else
                tmp[i] += 0;
        }

        return ch;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        String s = in.next();

        char[] result = solution(num, s);
        for(char c: result){
            System.out.print(c);
        }
    }
}