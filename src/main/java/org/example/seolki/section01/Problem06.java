package org.example.seolki.section01;
import java.util.*;

public class Problem06{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        ArrayList<Character> newarr = new ArrayList<Character>();
        for(char c : arr) {
            if(!newarr.contains(c)){
            newarr.add(c);
            }
        }
        for(Character c : newarr) {
            System.out.print(c);
            }
        }
}
