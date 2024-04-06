package org.example.part1.ch04.JH;

import java.io.*;
import java.util.StringTokenizer;

public class Algo3058 {

    static int[] arr;

    public static void main(String[] args) throws IOException {




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){

            arr = new int[7];

            int sum = 0;
            int min = 1000000;


            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<7; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                if(arr[j] % 2 ==0) {
                    sum += arr[j];
                    min = Math.min(min,arr[j]);
                }
            }

            bw.write(sum + " " + min + "\n");

    }

        bw.flush();
        bw.close();
    }
}
