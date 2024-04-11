package org.example.part1.ch05.JH;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Algo18870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] origin = new int[a];

        HashSet<Integer> ss = new HashSet<>();


        for(int i=0; i<a; i++){
            int q = Integer.parseInt(st.nextToken());
          ss.add(q);
          origin[i] = q;
        }

        int[] arr = new int[ss.size()];

        int k = 0;
        for(int i : ss){
            arr[k++] = i;
        }



        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]))
                continue;
            map.put(arr[i],i);
        }

        for(int i=0; i<a; i++){

            bw.write(map.get(origin[i])+" ");

        }
        bw.flush();
        bw.close();
    }
}
/*
 BufferedWriter 써라 되도록....
 */
