package org.example.part1.ch04.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo11005 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int digit = Integer.parseInt(input[1]);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int remainder = num % digit;
            char digitChar;
            if (remainder < 10) {
                digitChar = (char) ('0' + remainder);
            } else {
                digitChar = (char) ('A' + remainder - 10);
            }
            sb.append(digitChar);
            num /= digit;
        }

        System.out.println(sb.reverse().toString());
    }
}
/*
  까다로운 구현 문제였다....
 */
