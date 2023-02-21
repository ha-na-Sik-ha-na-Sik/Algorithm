package org.example.lunar.section03;

import java.util.*;

public class Problem02 {
    public static ArrayList<Integer> solution(int n1, int n2, int[] num1, int[] num2) {
        int pt1 = 0, pt2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(num1);
        Arrays.sort(num2);

        while (pt1 < n1 && pt2 < n2) {
            if (num1[pt1] == num2[pt2]) {
                answer.add(num1[pt1++]);
                pt2++;
            } else if(num1[pt1] < num2[pt2]){
                pt1++;
            } else pt2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] num1 = new int[n1];
        for (int i = 0; i < n1; i++) num1[i] = in.nextInt();
        int n2 = in.nextInt();
        int[] num2 = new int[n2];
        for (int i = 0; i < n2; i++) num2[i] = in.nextInt();

        ArrayList<Integer> result = solution(n1, n2, num1, num2);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
