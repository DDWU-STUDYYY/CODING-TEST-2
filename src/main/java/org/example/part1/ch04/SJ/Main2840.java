//package org.example.part1.ch04.SJ;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main2840 {
//
//  public static void main(String[] args) throws Exception {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//
//    int size = Integer.parseInt(st.nextToken());
//    int N = Integer.parseInt(st.nextToken());
//    String[] str = new String[size];
//
//    for (int i = 0; i < str.length; i++) {
//      str[i] = "?";
//    }
//
//    int current = 0;
//
//    for (int i = 0; i < N; i++) {
//      st = new StringTokenizer(br.readLine());
//      int cnt = Integer.parseInt(st.nextToken());
//      String ch = st.nextToken();
//
//      int next = current+ cnt;
//      while (next < size) {
//        next %= N;
//      }
//      current += next;
//
//      if (str[current].isEmpty()) {
//        break;
//      }else {
//        str[current] = ch;
//      }
//
//    }
//    i
//    while ()
//    for (int i = 0; i < str.length; i++) {
//      str[i] = "?";
//    }
//
//  }
//
//}
