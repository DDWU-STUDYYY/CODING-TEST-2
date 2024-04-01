package org.example.part2.ch01.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Algo1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String check = a.toUpperCase();

        int[] arr = new int[26];

        for(int i=0; i<check.length(); i++){
            arr[check.charAt(i)-'A']++;
        }

        int max = 0;

        for(int i=0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }

        int count = 0;
        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==max) {
                index = i;
                count++;
            }
        }

        if(count > 1)
            System.out.println("?");
        else
            System.out.println((char)(index + 'A'));

    }

}
