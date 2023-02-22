package org.example.seolki.section01;
import java.util.*;

public class Problem05{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int first = 0;
        int last = chars.length - 1;
        while(first <= last){
            if(!Character.isAlphabetic(chars[first])){
                first ++;
            }
            else if(!Character.isAlphabetic(chars[last])){
                last --;
            }
            else{
                char tmp = chars[first];
                chars[first] = chars[last];
                chars[last] = tmp;
                first ++;
                last --;
            }
        }
        for(char c : chars) {
            System.out.print(c);
            }
    }
}