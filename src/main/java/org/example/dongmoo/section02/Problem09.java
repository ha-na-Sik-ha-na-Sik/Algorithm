package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem09 {
    //격자판 최대합
    public static int diagonalSum(int n, int[][] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += nums[i][i];
            sum2 += nums[i][n - 1 - i];
        }
        return Math.max(sum1, sum2);
    }

    public static int solution(int n, int[][] nums) {
        List<Integer> sums = new ArrayList<>();
        int answer = 0;
        sums.add(diagonalSum(n, nums));

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += nums[i][j];
                sum2 += nums[j][i];
            }
            sums.add(sum1);
            sums.add(sum2);
        }
        return sums.stream()
                .mapToInt(x -> x)
                .max().getAsInt();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                nums[i][j] = Integer.parseInt(strings[j]);
            }
        }
        System.out.println(solution(n, nums));
    }

}
