package org.example.seolki.section01;
import java.util.*;

public class Problem03{
public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String max = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() >= max.length()){
               max = arr[i];
                }
            }
            System.out.println(max);
            }
        }
