package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem08 {
    // 등수구하기
    public static int[] solution(int cnt, String str) {
        List<Integer> nums = Arrays.stream(str.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] answers = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            answers[i] = 1;
        }
        for (int i = 0; i < cnt; i++) {
            int num = nums.get(i);
            for (int j = 0; j < cnt; j++) {
                int temp = nums.get(j);
                if (temp < num) {
                    answers[j]++;
                }
            }
        }
        return answers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] solution = solution(Integer.parseInt(br.readLine()), br.readLine());
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
