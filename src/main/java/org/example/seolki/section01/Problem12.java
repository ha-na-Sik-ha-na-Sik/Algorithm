package org.example.seolki.section01;
import java.util.*;

public class Problem12{
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Character> arr =new ArrayList<>();//이진수 담는 char형 배열
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#'){
                arr.add('1');
            }
            else{
                arr.add('0');
            }
        }
        ArrayList<String> chars =new ArrayList<>();
        int index = 0;
        int term = 0;
        StringBuilder ans =new StringBuilder();
        while(index < N){
            for(int i = 0 + term; i < 7 + term; i++){
                ans.append(String.valueOf(arr.get(i)));
            }
            chars.add(String.valueOf(ans));
            index ++;
            term += 7;
            ans =new StringBuilder();
        }
        // 2진수 => 10진수
        for(int i = 0; i < chars.size(); i++){
            int num =Integer.valueOf(chars.get(i), 2);
            System.out.print((char) num);
        }
    }
}
