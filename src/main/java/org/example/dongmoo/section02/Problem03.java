package org.example.dongmoo.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem03 {
    //가위 바위 보
    public static List<String> solution(int nums,int[] infoA, int[] infoB) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < nums; i++) {
            if (infoA[i] == infoB[i]) {
                answer.add("D");
            } else if (infoA[i] == 2 && infoB[i] == 1) {
                answer.add("A");
            } else if (infoA[i] == 3 && infoB[i] == 2) {
                answer.add("A");
            } else if (infoA[i] == 1 && infoB[i] == 3) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        String[] infoA = br.readLine().split(" ");
        String[] infoB = br.readLine().split(" ");
        int[] infoAs = new int[nums];
        int[] infoBs = new int[nums];

        for (int i = 0; i < nums; i++) {
            infoAs[i] = Integer.parseInt(infoA[i]);
            infoBs[i] = Integer.parseInt(infoB[i]);
        }
        solution(nums, infoAs, infoBs).forEach(System.out::println);
    }
}
