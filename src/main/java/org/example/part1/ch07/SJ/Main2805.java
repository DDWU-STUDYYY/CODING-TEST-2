package org.example.part1.ch07.SJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2805 {


  private static int findMinIdx(int[] arr, int cutting) {
    int l = 0, r = arr.length - 1;
    int minIdx = arr.length;
    while (l <= r) {
      int m = (l + r) / 2;
      if (arr[m] - cutting >= 0) { // 자르면 양수임(잘린 값이 유효함)
        r = m - 1; // 왼쪽을 탐색해야함
        minIdx = m;
      } else { // 자르면 음수임(잘린값이 유효하지 않음)
        l = m + 1; // -> 오른쪽을 탐색해야함 10  14 15 15 20
      }

    }
    return minIdx;
  }

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;


    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    long M = Integer.parseInt(st.nextToken());

    int[] treeH = new int[N];
    long[] cntH = new long[N];

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      treeH[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(treeH);
    cntH[0] = treeH[0];
    for (int i = 1; i < N; i++) {
      cntH[i] = treeH[i] + cntH[i - 1];
//      System.out.print(cntH[i]+" "+treeH[i] +" "+cntH[i - 1]+"\n");
    }


//    System.out.println();

    int cutting = treeH[N - 1] - 1;
    long cnt = 0;
    for (int i = treeH[N - 1]; i >= treeH[0]; i--) {
      int min = findMinIdx(treeH, cutting) - 1;

      if (min >= 0) {
        cnt = cntH[N - 1] - cntH[min] - (cutting * ((N - 1) - min));
      } else {
        cnt = cntH[N - 1] - cntH[0] - (cutting * (N - 1));
      }

////       10 15 17 20
//      System.out.print("i = "+i+" "+cnt);
//      System.out.print(" min: " +min+ " cutting = " + cutting+" ");
//      System.out.print("누적합 : " +(cntH[N - 1] - cntH[min])+" \n");
      if (cnt >= M) {
        break;
      }

      cutting--;
    }

    bw.write(String.valueOf(cutting));
    bw.flush();
    bw.close();
    br.close();
  }

}
