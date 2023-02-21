package org.example.jackson.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {
    public static ArrayList<Character> solution(int[] arrA, int[] arrB, int N) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (arrA[i] == arrB[i]) answer.add('D'); //만약 arrA와 arrB를 비교해서 인덱스의 숫자가 같다면 D를 출력해라.
                //A가 이기는 경우 -> A 출력
            else if (arrA[i] == 1 && arrB[i] == 3) answer.add('A'); //A는 가위 B는 보
            else if (arrA[i] == 2 && arrB[i] == 1) answer.add('A'); //A는 바위 B는 가위
            else if (arrA[i] == 3 && arrB[i] == 2) answer.add('A'); //A는 보 B는 가위
            else answer.add('B');     //위에 해당 사항이 없으면 B가 이기는 경우 -> B 출력
        }
        return answer;
    }

    //두 개의 배열을 입력받고 가위바위보 경우에 수에 따라 새로운 배열에 결과 값 입력



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arrA = new int[N]; // N개의 숫자가 들어갈 수 있는 배열 생성
        int[] arrB = new int[N];

        for (int i = 0; i < N; i++) {
            arrA[i] = scan.nextInt(); // N개의 숫자를 입력받는 반복문 -> A가 낸 것
        }
        for (int i = 0; i < N; i++) {
            arrB[i] = scan.nextInt(); // N개의 숫자를 입력받는 반복문 -> B가 낸것
        }
        for (int x : solution(arrA, arrB, N)) {
            System.out.println((char) x);
        }
    }
}
