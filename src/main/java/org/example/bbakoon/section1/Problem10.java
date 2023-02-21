package org.example.bbakoon.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 알게된 점
 * -> 방향으로 distance 저장
 * <- 방향으로 distance min 비교
 * 위 알고리즘은 O(n)으로 더 빠름
 * 아래 코드는 최악의 경우 O(n^2) ex) eeeeeee e
 */
public class Problem10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char c = st.nextToken().charAt(0);
        ArrayList<Integer> idxs = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                idxs.add(i);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (Integer idx : idxs) {
                min = Math.min(min, Math.abs(i - idx));
            }
            answer.append(min).append(" ");
        }
        System.out.println(answer);
    }
}
