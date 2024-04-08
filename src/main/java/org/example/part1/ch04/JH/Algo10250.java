package org.example.part1.ch04.JH;

import java.io.*;
import java.util.StringTokenizer;

public class Algo10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        int h;
        int w;
        int customer;



        for(int i=0; i<a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            customer = Integer.parseInt(st.nextToken());

            int floor= customer % h;
            if(floor ==0)
                floor = h; // 층 수가 0 일 경우 가장 꼭대기의 층이다

            int roomNum = (customer/h) + 1;
            if(customer % h ==0)
                roomNum--;

            int room = (floor*100) + roomNum;

            bw.write(room + "\n");


        }

        bw.flush();;
        bw.close();
    }
}
/*
 사용자가 꼭대기 층에 있을 때의 정보를 잘 생각해서 넣어주어야 한다.

 */
