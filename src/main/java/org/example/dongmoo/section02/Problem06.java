package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem06 {
    //뒤집은 소수
    public static List<Integer> solution(List<Integer> nums, int cnt) {
        return nums.stream()
                .filter(num -> {
                    if (num == 1) {
                        return false;
                    }
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            return false;
                        }
                    }
                    return true;
                }).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        List<Integer> nums = Arrays.stream(br.readLine().split(" "))
                .map(n -> Integer.parseInt(new StringBuilder(n).reverse().toString()))
                .collect(Collectors.toList());

        solution(nums, cnt).forEach(
                n -> System.out.print(n + " ")
        );

    }
}
