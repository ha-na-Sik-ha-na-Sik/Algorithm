package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem01 {
    //큰 수 출력하기
    public static List<Integer> solution(String nums) {
        List<Integer> integers = Arrays.stream(nums.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();
        int front = 0;
        for (Integer integer : integers) {
            if (front < integer) {
                answer.add(integer);
            }
            front = integer;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        solution(br.readLine())
                .forEach(num -> System.out.print(num + " "));

    }
}
