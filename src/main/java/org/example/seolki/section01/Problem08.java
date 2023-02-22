package org.example.seolki.section01;
import java.util.*;

public class Problem08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toLowerCase().toCharArray();
        ArrayList<Character> arr =new ArrayList<>();
        String num = "[0-9]";
        for(char c: chars){
            if(Character.isAlphabetic(c) ||Character.isDigit(c)){
                arr.add(c);
            }
        }
        int mid = (arr.size() / 2);
        String ans = "";
        for(int i = 0; i < mid; i++) {
            if(arr.get(i) != arr.get(arr.size() - 1 - i)){
                ans = "NO";
                break;
            }
            else{
                ans = "YES";
            }
            }
        System.out.print(ans);
    }
}
