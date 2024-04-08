package org.example.part1.ch04.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Algo2817 {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int participants = Integer.parseInt(bufferedReader.readLine());
        int staffCounts = Integer.parseInt(bufferedReader.readLine());

        List<Staff> staffs = new ArrayList<>();
        List<Double> scores = new ArrayList<>();
        while (staffCounts-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String name = stringTokenizer.nextToken();
            int votes = Integer.parseInt(stringTokenizer.nextToken());
            if (votes < participants * 0.05) {
                continue;
            }
            Staff staff = Staff.of(name, votes);
            staffs.add(staff);
            scores.addAll(staff.getScores());
        }

        staffs.sort(Staff::compareTo);
        scores.sort(Comparator.comparingDouble(Double::doubleValue).reversed());

        for (int i = 0; i < 14; i++) {
            Double score = scores.get(i);
            staffs.stream().filter(staff -> staff.isOwn(score))
                    .forEach(Staff::receiveChip);
        }

        staffs.forEach(System.out::println);
    }

    static class Staff implements Comparable<Staff> {
        private String name;
        private int votes;
        private List<Double> scores;
        private int chipCounts;

        public Staff(String name, int votes, List<Double> scores) {
            this.name = name;
            this.votes = votes;
            this.scores = scores;
        }

        public static Staff of(String name, int votes) {
            List<Double> list = new ArrayList<>();
            for (int i = 1; i <= 14; i++) {
                list.add((double)votes / i);
            }

            return new Staff(name, votes, list);
        }

        public boolean isOwn(Double thatScore) {
            return scores.stream().anyMatch(score -> score.equals(thatScore));
        }

        public List<Double> getScores() {
            return scores;
        }

        @Override
        public String toString() {
            return name + " " + chipCounts;
        }

        public void receiveChip() {
            chipCounts++;
        }

        public String getName() {
            return name;
        }
        @Override
        public int compareTo(Staff that) {
            return this.name.compareTo(that.getName());
        }

    }

}
/*
  이건 모르겠다... 다음에 다시 한번 더 풀어봐야 겄다...
 */
