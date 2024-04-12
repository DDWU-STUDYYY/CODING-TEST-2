package org.example.part1.ch05.SJ;

import java.io.*;
import java.util.*;

public class Main7785 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    Set<String> set = new HashSet<>();

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());

      String name = st.nextToken();
      String status = st.nextToken();
      if (status.equals("enter")) {
        set.add(name);
      } else {
        set.remove(name);
      }
    }

    ArrayList<String> list = new ArrayList<>(set);
    list.sort(Comparator.reverseOrder());

    for (String name : list) {
      bw.write(name+"\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

}
