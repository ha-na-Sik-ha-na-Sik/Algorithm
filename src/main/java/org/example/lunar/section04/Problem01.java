package org.example.lunar.section04;

import java.util.*;

public class Problem01 {
    public static char solution(int n, String s){
        HashMap<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(result.containsKey(ch) == false)
                result.put(ch, 1);
            else
                result.put(ch, result.get(ch)+1);
        }

        List<Map.Entry<Character, Integer>> entryList = new LinkedList<>(result.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        return entryList.get(result.size()-1).getKey();
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        System.out.println(solution(n, s));
    }
}
