package org.example.part1.ch04.JH;

import java.io.*;

public class Algo11068 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num;


        for (int i = 0; i < n; i++) {

            String s = br.readLine();
            num = Integer.parseInt(s);

            boolean cc = stringCheck(s.toCharArray());

            if (cc == true) {
                bw.write("1\n");
            } else {

                boolean check = false;

                for (int p = 2; p <= 64; p++) {
                    if (makeDigit(num, p) == true) {
                        check = true;
                        break;
                    }
                }

                    if (check == true) {
                        bw.write("1\n");
                    }
                 else {
                    bw.write("0\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }

    public static boolean stringCheck (char[] arr){
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i])
                return false;
        }
        return true;
    }

    public static boolean makeDigit(int num, int digit) {

        StringBuilder sb = new StringBuilder();

            while (num > 0) {
                int remainder = num % digit;
                char digitChar;
                if (remainder < 10) {
                    digitChar = (char) ('0' + remainder);
                } else {
                    digitChar = (char) ('A' + remainder - 10);
                }
                sb.append(digitChar);
                num /= digit;
            }

            String s = sb.toString();
            char[] arr = s.toCharArray();

            if(stringCheck(arr) == true)
                return true;
            else
                return false;
    }

}
