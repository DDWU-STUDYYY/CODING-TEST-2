package org.example.part1.ch01.JH;

import java.io.IOException;
import java.util.Scanner;

public class Algo1919 {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int answer = 0;

        int[] countA = new int[26]; // dared [1,0,0,2 ..]
        int[] countB = new int[26];

        for(int i=0; i<a.length(); i++){
            countA[a.charAt(i)-'a']++;
        }

        for(int i=0; i<b.length(); i++){
            countB[b.charAt(i)-'a']++;
        }

        for(int i=0; i<countA.length; i++){
            if(countA[i] != countB[i]){
                answer += Math.abs(countA[i] - countB[i]);
            }
        }

        System.out.println(answer);
    }
}
/*
 알파벳 배열 만드는 방법을 잘 생각해보자 !!
 */
