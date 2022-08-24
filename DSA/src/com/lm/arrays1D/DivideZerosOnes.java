package com.lm.arrays1D;

public class DivideZerosOnes {
    public static void main(String args[]) {
        int [] arr ={0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        for(int x : arr)  System.out.print(x);
        System.out.println();
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            if(arr[left]==0) left++;
            if(arr[right] == 1) right--;
            else if(arr[left]==1&&arr[right]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
           else if(arr[left]==0&&arr[right]==1){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for(int x : arr) System.out.print(x);
    }
}

//OUTPUT:
//-------------------------------------------
//01010101010101
//00000001111111
//------------------------------------------
//Time complexity = O(N)
//Space Complexity = O(1)