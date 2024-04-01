package org.example.part2.ch01.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo2744 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++){
            if(ch[i] >='A' && ch[i] <='Z')
                ch[i] += 32;
            else
                ch[i] -= 32;
        }

        String answer = new String(ch);

        System.out.println(answer);
    }
}