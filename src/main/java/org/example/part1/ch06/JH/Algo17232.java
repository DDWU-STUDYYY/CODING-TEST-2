package org.example.part1.ch06.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo17232 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        char map[][] = new char[N+1][M+1];

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i=1; i<N+1; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j=1; j<M+1; j++){
                map[i][j] = str.charAt(j-1);
            }
        }

        int sum[][] = new int[N+1][M+1];
        for(int time = 0; time < T; time++) {
            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < M + 1; j++) {
                    sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
                    if (map[i][j] == '*')
                        sum[i][j]++;
                }
            }

            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < M + 1; j++) {
                    int r1 = Math.max(i - K, 1);
                    int c1 = Math.max(j - K, 1);
                    int r2 = Math.min(i + K, N);
                    int c2 = Math.min(j + K, M);

                    int around = sum[r2][c2] - sum[r2][c1 - 1] - sum[r1 - 1][c2] + sum[r1 - 1][c1 - 1];
                    if (map[i][j] == '*')
                        around--;

                    if (map[i][j] == '*') {
                        if (around < a || around > b)
                            map[i][j] = '.';
                        else
                            map[i][j] = '*';

                    } else {
                        if (around > a && around <= b)
                            map[i][j] = '*';
                        else
                            map[i][j] = '.';
                    }
                }
            }
        }
                for(int i = 1; i<N+1; i++){
                    for(int j=1; j<M+1; j++){
                        System.out.print(map[i][j]);
                    }
                    System.out.println();
                }
            }

        }


}
