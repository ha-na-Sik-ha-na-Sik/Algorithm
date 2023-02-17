package org.example.dongmoo.section01;

import java.util.Arrays;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Problem04 {
    public static List<String> solution(String[] arr) {
        return Arrays.stream(arr)
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = bufferedReader.readLine();
        }
        solution(strs)
                .forEach(System.out::println);
    }
}
