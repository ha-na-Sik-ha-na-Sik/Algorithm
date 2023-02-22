package org.example.seolki.section01;
import java.util.*;

public class Problem10{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        char[] chars = sc.next().toCharArray();// teachermode
        char find = sc.next().charAt(0);// e
        ArrayList<Integer> integers =new ArrayList<>();
        ArrayList<Integer> ans =new ArrayList<>();
        int index = 0;
        for(char c : chars){
            if(c == find){
                integers.add(index);
            }
            index ++;
        }
        for(int i = 0; i < chars.length; i++){
            ArrayList<Integer> arr =new ArrayList<>();
            for(int j = 0; j < integers.size(); j++){
                if(integers.get(j) >= i) {
                    arr.add(integers.get(j) - i);
                }
                else{
                    arr.add(i - integers.get(j));
                }
            }
            Collections.sort(arr);
            ans.add(arr.get(0));
        }
        for(Integer i : ans) {
        System.out.print(i + " ");
        }
    }
}
