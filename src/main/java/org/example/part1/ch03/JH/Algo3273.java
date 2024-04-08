package org.example.part1.ch03.JH;

import java.io.IOException;
import java.util.Scanner;

public class Algo3273 {


    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] a = new int[N];

       for(int i=0; i<N; i++)
           a[i] = sc.nextInt();
       int x = sc.nextInt();

       boolean[] exist = new boolean[10000001];
       for(int i=0; i<N; i++)
           exist[a[i]] = true;

       int ans = 0;
       for(int i=0; i<N; i++){
           int pairValue = x-a[i];

           if(0<=pairValue && pairValue <=1000000)
               ans += exist[pairValue]? 1 : 0;
       }

       System.out.println(ans/2);

    }

}
