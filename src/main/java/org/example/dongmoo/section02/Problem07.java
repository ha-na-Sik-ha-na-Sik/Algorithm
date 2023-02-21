package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem07 {
    // 점수계산
    public static int solution(String result) {
        List<Integer> results = Arrays.stream(result.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int continuous = 0;
        int answer = 0;
        for (int n : results) {
            if (n == 1) {
                continuous++;
                answer = answer + continuous;
            }
            else {
                continuous = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String results = br.readLine();
        System.out.println(solution(results));;
    }
}
