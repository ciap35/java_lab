package com.java.laboratory.hackerRank;

public class StairCase {
    public static void main(String[] args) {
        solution1(5);
    }

    public static void solution1(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int fillWithSpaces = n - i; //5
            for (int j = 0; j < fillWithSpaces; j++) {
                sb.append(" ");
            }
            for (int draw = 0; draw < i; draw++) {
                sb.append("#");
            }

            System.out.println(sb.toString());
        }
    }

    public static void solution2(int n) {
        int fillWithSpaces = 0;
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            fillWithSpaces = n - i; //5
            for (int j = fillWithSpaces; j >= 1; j--) {
                sb.append(" ");
            }
            for (int draw = (n - fillWithSpaces - 1); draw >= 0; draw--) {
                sb.append("#");
            }

            System.out.println(sb.toString());
            fillWithSpaces = 0;
        }
    }

}
