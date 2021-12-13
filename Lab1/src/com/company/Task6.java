package com.company;

public class Task6 {
    public static void main(final String[] args) {
       final int[][] array1 = {
                { 1, 4, -2 },
                { 3, 5, -6 },
                { 4, 5, 2 }
        };

       final int[][] array2 = {
                { 5, 2, 8, -1 },
                { 3, 6, 4, 5 },
                { -2, 9, 7, -3 }
        };
       final Task6 test = new Task6();
        test.printArray(test.multiplication(array1, array2));

    }



    private int[][] multiplication(final int[][] array1,final int[][] array2)
    {
       final int r1, r2, c1, c2;
        r1 = array1.length;
        c1 = array1[0].length;

        r2 = array2.length;
        c2 = array2[0].length;

       final int[][] result;
        if (c1 != r2)
        {
            System.out.println("Error!");
            result = new int[0][0];
        }
        else
        {
            result = new int[r1][c2];

            for (int i = 0; i < r1; i++)//2
            {
                for (int j = 0; j < c2; j++)//4
                {
                    for (int k = 0; k < c1; k++)
                    {
                        result[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
        }

        return result;
    }

    private void printArray(final int[][] array)
    {
        for (final int[] arr : array)
        {
            for (final int element : arr)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}