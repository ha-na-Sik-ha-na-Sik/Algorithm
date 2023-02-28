package org.example.dongmoo.section03;
import java.util.Scanner;

public class Problem03 {
    public static int solution(int[] moneys, int days) {
        int temp = 0;
        for (int i = 0; i < days; i++) {
            temp += moneys[i];
        }
        int answer = temp;
        for (int i = days; i < moneys.length; i++) {
            temp = temp + moneys[i] - moneys[i - days];
            answer = Math.max(temp, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDay = sc.nextInt();
        int days = sc.nextInt();
        int[] moneys = new int[totalDay];

        for (int i = 0; i < totalDay; i++) {
            moneys[i] = sc.nextInt();
        }
        System.out.println(solution(moneys, days));
    }


}
