package com.lm.arrays2D;

public class LargestElement {
    public static void main(String args[]) {
        int [][] arr= { {15,30,2,19}, {101,202,45,60}, {75,101,500,34}, {35,28,19,0}};
        int largest = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>largest) largest = arr[i][j];
            }
        }
        System.out.println("The largest element in this 2D Array is "+largest);
    }
}

//OUTPUT
//-------------------------------
//The largest element in this 2D Array is 500
//
//Time complexity = O(N^2)
//Space complexity = O(N)