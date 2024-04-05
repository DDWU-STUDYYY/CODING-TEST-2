package org.example.part1.ch04.JH;

import java.io.*;

public class Algo10448 {
    static int arr[];

    static int selected[];

    public static void main(String[] args) throws IOException {

        arr = new int[45];

        selected = new int[3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int a = Integer.parseInt(br.readLine());

        int[] check = new int[a];

        for(int i=1; i<arr.length; i++){
            arr[i]  = i * (i+1) /2;
        }

        for(int i=0; i<a; i++) {
            check[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<a; i++){
           int q =  check(arr, check[i]);

           bw.write(q+"\n");
        }

        bw.flush();
        bw.close();

    }

    public static int check(int[] arr, int sum){

        for(int i=1; i<arr.length; i++){
            for(int j=i; j<arr.length;j++){
                for(int k=j; k<arr.length; k++)
                {
                    int first = arr[i];
                    int second = arr[j];
                    int third =  arr[k];
                    int result = first + second + third;

                    if(result==sum)
                        return 1;
                }
            }
        }

        return 0;
    }
}