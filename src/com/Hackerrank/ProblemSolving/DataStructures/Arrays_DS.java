package com.Hackerrank.ProblemSolving.DataStructures;

public class Arrays_DS {

    public int[] reverseIntArray(int[] a){
        int temp;
        for(int i=0; i<a.length/2; i++){
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i]=temp;
        }

        return a;
    }



}
