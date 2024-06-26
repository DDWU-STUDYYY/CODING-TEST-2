package org.example.part1.ch05.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Algo1302 {

    public static void main(String[] args) throws IOException {

        Map<String,Integer> titles = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String title = br.readLine();
            titles.put(title, titles.getOrDefault(title,0)+1);
        }

        String maxTitle = "";
        int maxCount = 0;

        for(Map.Entry<String,Integer> title : titles.entrySet()){
            String titleName = title.getKey();
            int count = title.getValue();

            if(count > maxCount || (count==maxCount && titleName.compareTo(maxTitle) < 0 )){
                maxTitle = titleName;
                maxCount = count;
            }
        }

        System.out.println(maxTitle);
    }
}
/*
 Map.Entry<String,Integer> title : titles.entrySet()
 getKey()
 getValue() 기억하기. containsKey("어쩌고")
 */
