package com.company;

public class Task5 {
    public static void main(final String[] args) {
       final int n = 2;
       final int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }

        System.out.println("Матриця");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( a[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               final int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

        System.out.println("Транспонована");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( a[i][j]);
            }
            System.out.println();
        }
    }
}