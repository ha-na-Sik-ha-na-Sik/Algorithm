package org.example.seolki.section01;
import java.util.*;

public class Problem11{
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        ArrayList<Character> arr =new ArrayList<>();
        int cnt = 1;
        for(int i = 0; i < chars.length; i++) {
            int last = arr.size() - 1;
            if(arr.isEmpty()) {
                arr.add(chars[i]);
            }
            else if(arr.get(last) == chars[i]) {//중복된다면
                cnt++;
                if(i == chars.length - 1) {
                    arr.add((char) (cnt + '0'));
                }
                }else if(arr.get(last) != chars[i]) {
                    if(cnt != 1) {
                        arr.add((char) (cnt + '0'));
                    }
                cnt = 1;
                arr.add(chars[i]);
            }
        }
        for(char c : arr) {
        System.out.print(c);
        }
    }
}
