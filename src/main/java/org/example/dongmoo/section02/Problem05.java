package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem05 {
    //소수(에라토스테네스 체)
    public static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j+=i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));

    }
}
