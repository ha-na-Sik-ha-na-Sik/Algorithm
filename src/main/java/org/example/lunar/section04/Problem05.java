package org.example.lunar.section04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem05 {
    public static int solution(int n, int k, Integer[] num) {
        TreeSet<Integer> ts = new TreeSet<>();
        int answer = 0, pt1 = 0, pt2 = 1, pt3 = 2;
        Arrays.sort(num, Collections.reverseOrder());

        Loop:
        while (pt1 < n - 2) {
            while (pt2 < n - 1) {
                while (pt3 < n) {
                        ts.add(num[pt1] + num[pt2] + num[pt3++]);
                }
                pt2++;
                pt3 = pt2 + 1;
            }
            pt1++;
            pt2 = pt1 + 1;
        }

        Iterator iter = ts.iterator();
        if(ts.size() < k){
            answer = -1;
        } else {
            for(int i = 0; i < ts.size()-k+1; i++) {
                answer = Integer.parseInt(iter.next().toString());
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Integer[] num = new Integer[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(solution(n, k, num));
    }
}
