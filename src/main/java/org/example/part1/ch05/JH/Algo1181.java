package org.example.part1.ch05.JH;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Algo1181 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        int c = 0;
        boolean check = true;

        ArrayList<String> arr1 = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            check = true;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    check = false;
                    break;
                }

            }
            if(check){
                arr1.add(arr[i]);
            }
        }

        String[] arr2 = new String[arr1.size()];
        int size = 0;


        for(String temp : arr1){
            arr2[size++] = temp;
        }

        Arrays.sort(arr2, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2){

                if(s1.length() == s2.length())
                    return s1.compareTo(s2);
                return s1.length() - s2.length();
            }
        });

        for(String s : arr2){
            bw.write(s+"\n");
        }

        bw.flush();
        bw.close();

    }
}
