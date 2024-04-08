package org.example.part1.ch05.JH;

import java.io.*;
import java.util.Arrays;

public class Algo2751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[a];

        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i : arr){
           bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
    }
}
