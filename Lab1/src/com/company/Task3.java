package com.company;

public class Task3 {
    public static String MergeIntnChar(final int[] a,final char[] b){
      final  int size;
        String result="";
        if (a.length>b.length){
            size=a.length;
        } else {
            size=b.length;
        }

        for(int i=0;i<size;i++){
            if (a.length > i && b.length > i){
                result = result + a[i] + "" + b[i];
            } else if(a.length > i && b.length <= i){
                result = result + "" +a[i];
            } else if (a.length <= i && b.length > i){
                result = result + "" +b[i];
            }
        }
        return result;
    }

    public static void main(final String[] args) {
       final int[] a={1,2,3,4,5,6,7};
       final char[] b={'o','l','p','m','c'};
        int size;
        System.out.println(MergeIntnChar(a,b));
    }
}

