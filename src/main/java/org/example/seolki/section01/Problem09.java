package org.example.seolki.section01;
import java.util.*;

public class Problem09{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        ArrayList<Character> arr =new ArrayList<>();
        for(char c : chars){
            if(Character.isDigit(c)){
                arr.add(c);
            }
        }
        while(arr.get(0) == '0') {
            arr.remove(0);
        }
        for(char c : arr) {
            System.out.print(c);
        }
    }
}
