package org.example.dongmoo.section02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem12 {
    //멘토링
    public static int solution(int[][] totalPair, int[][] scores, int students, int testCount) {

        int cnt = 0;

        for (int[] ints : totalPair) {
            int mentor = ints[0];
            int mentee = ints[1];

            for (int j = 0; j < testCount; j++) {
                if (scores[mentor][j] >= scores[mentee][j]) {
                    break;
                }
                if (j == testCount - 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int testCount = sc.nextInt();
        sc.nextLine();

        int[][] totalPairs = new int[students * (students - 1)][2];
        int[][] scores = new int[students][testCount];
        int n = 0;
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < students; j++) {
                if (i == j) {
                    continue;
                }
                totalPairs[n][0] = i;
                totalPairs[n][1] = j;
                n++;
            }
        }

        for (int i = 0; i < testCount; i++) {
            List<Integer> score = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());

            for (int j = 0; j < students; j++) {
                scores[score.get(j)-1][i] = j;
            }
        }

        System.out.println(solution(totalPairs, scores, students, testCount));

    }
}
