package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem02 {
    //보이는 학생
    public static int solution(String height) {
        List<Integer> heights = Arrays.stream(height.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();
        int front = 0;
        for (Integer integer : heights) {
            if (integer > front) {
                answer.add(integer);
                front = integer;
            }
        }
        return answer.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        System.out.println(solution(br.readLine()));
    }
}
