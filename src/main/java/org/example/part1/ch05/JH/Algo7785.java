package org.example.part1.ch05.JH;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Algo7785 {
    public static void main(String[] args) throws IOException {

        // enter 이면 아직 퇴근하지 않았으니까 그냥 출력해주면 된다.

        Scanner sc = new Scanner(System.in);

        Set<String> set = new TreeSet<>();

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String name = sc.next();
            String status = sc.next();

            if(status.equals("enter"))
                set.add(name);
            else
                set.remove(name);
        }

        String[] orderdName = set.toArray(new String[set.size()]);
        for(int i=orderdName.length-1; i>=0; i--)
            System.out.println(orderdName[i]);
    }
}
/*
  트리셋은 자동으로 정렬을 해준다.

  그리고 set 을 배열으로 바꿀 수 있다. set.toArray(new String[set.size()]);


 */