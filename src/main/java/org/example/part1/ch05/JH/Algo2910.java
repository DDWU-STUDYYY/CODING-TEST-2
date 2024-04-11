package org.example.part1.ch05.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Algo2910 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer> map = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());

            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return Integer.compare(map.get(b), map.get(a));
            }
        });

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer element = it.next();
            for(int i=0; i<map.get(element); i++){
                sb.append(element+" ");
            }
        }

        System.out.println(sb);
    }
}


