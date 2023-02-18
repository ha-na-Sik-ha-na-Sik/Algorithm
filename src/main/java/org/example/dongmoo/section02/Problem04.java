package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem04 {
    //피보나치 수열
    public static List<Integer> solution(int num) {
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);

        for (int i = 2; i < num; i++) {
            answer.add(answer.get(i - 1) + answer.get(i - 2));
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        solution(num).forEach(n -> System.out.print(n +" "));
    }
}
