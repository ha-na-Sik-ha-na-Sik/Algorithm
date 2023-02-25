package org.example.lunar.section04;

import java.io.*;
import java.util.*;

public class Problem03 {
    public static int[] solution(int n, int k, int[] num){
        HashMap<Integer, Integer> result = new HashMap<>();
        int[] answer = new int[n-k+1];
        int pt1 = 1, pt2 = k;

        for(int i = 0; i < k; i++) {
            int tmp = num[i];
            if(result.containsKey(tmp) == false)
                result.put(tmp, 1);
            else
                result.put(tmp, result.get(tmp)+1);
        }
        answer[0] = result.size();

        while(pt1 <= n-k){
            int tmp = num[pt1-1];
            if(result.get(tmp) < 2) {
                result.remove(tmp);
            } else {
                result.put(tmp, result.get(tmp)-1);
            }

            tmp = num[pt2++];
            if(result.containsKey(tmp) == false)
                result.put(tmp, 1);
            else
                result.put(tmp, result.get(tmp)+1);

            answer[pt1] = result.size();
            pt1++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer2 = solution(n, k, num);
        for(int i : answer2){
            System.out.print(i + " ");
        }
    }
}
