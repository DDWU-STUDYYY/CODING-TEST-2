package org.example.part1.ch05.JH;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Algo10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Member[] members = new Member[n];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age == o2.age)
                    return o1.idx - o2.idx;

                return o1.age - o2.age;
            }
        });

        for(Member m :members)
        {
            bw.write(m.age + " " + m.name + "\n");
        }

        bw.flush();
        bw.close();

    }



    }


class Member {
    int age;
    String name;
    int idx;

    Member(int age, String name, int idx) {
        this.age = age;
        this.name = name;
        this.idx = idx;
    }
}
