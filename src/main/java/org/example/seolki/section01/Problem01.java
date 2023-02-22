package org.example.seolki.section01;
import java.util.*;

public class Problem01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String c = sc.next();
        int count = 0;

        str = str.toLowerCase();
        c = c.toLowerCase();
        // c가 대문자일 때를 고려 못했었음 조건 놓치지 않게 주의!
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c.charAt(0)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
