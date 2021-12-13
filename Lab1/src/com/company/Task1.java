package com.company;

public class Task1 {
    public static void main(final String[]  args) {
        final String[] arr={"BMW","Mercedes","Audi","P"};
        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].length()< arr[j].length() ) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[j]);


                }
    }
}



