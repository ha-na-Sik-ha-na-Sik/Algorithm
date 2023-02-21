package org.example.dongmoo.section03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem01 {
    //두 배열 합치기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String arr1 = sc.nextLine();
        sc.nextLine();
        String arr2 = sc.nextLine();

        List<Integer> collect = Arrays.stream(arr1.split(" ")).mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());


        Arrays.stream(arr2.split(" ")).mapToInt(Integer::parseInt)
                .boxed()
                .forEach(collect::add);

        collect.stream().sorted()
        .forEach(a -> System.out.print(a + " "));

    }
}
