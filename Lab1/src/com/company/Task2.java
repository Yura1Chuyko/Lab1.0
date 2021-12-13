package com.company;

public class Task2 {
    public static void main(final String[] args) {
       final String[] arr={"Volvo","BMW","Mercedesoo"};
       final char c='o';
        System.out.println("result=" + countCharsInArray(arr,c));
    }
    public static int countCharsInArray(final String[] arr,final char toCheck){
        int k=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
          final String currentString = arr[i];
            for(int j=0;j<currentString.length();j++){
                if(currentString.charAt(j)== toCheck){
                    k++;
                }
            }
        }
        return k;
    }
}
