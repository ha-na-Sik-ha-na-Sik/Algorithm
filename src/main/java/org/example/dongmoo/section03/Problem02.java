package org.example.dongmoo.section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem02 {
    public static String solution(int[] arr1, int[] arr2, int num1, int num2) {
        int a = 0;
        int b = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        StringBuilder answer = new StringBuilder();
        while (a < num1 && b < num2) {
            if (arr1[a] < arr2[b]) {
                a++;
            } else if (arr1[a] != arr2[b]) {
                b++;
            } else {
                answer.append(arr1[a]).append(" ");
                a++;
                b++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[num1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int num2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[num2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num1; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr1, arr2,num1,num2));

    }
}
