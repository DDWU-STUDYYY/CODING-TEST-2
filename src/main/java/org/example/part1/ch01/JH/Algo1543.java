package org.example.part1.ch01.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1543 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int count = 0;
        int k = 0;

        while (k < a.length()) {
            boolean match = true;
            for (int j = 0; j < b.length(); j++) {
                if (k + j >= a.length() || b.charAt(j) != a.charAt(k + j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
                k += b.length();
            } else {
                k++;
            }
        }
        System.out.println(count);
    }
    }

