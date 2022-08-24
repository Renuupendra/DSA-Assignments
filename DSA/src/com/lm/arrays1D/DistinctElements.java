package com.lm.arrays1D;

public class DistinctElements {
	
    public static void main(String args[]) {
    	
        int[] arr = {1,1,1,2,2,2,2,3,4,5,1,1,5,2,7};
        System.out.println("The distinct elements are ");
        for(int i=0;i<=arr.length-1;i++){
            int count=0;
            for(int j =0;j<=arr.length-1;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==1) {
            System.out.println(arr[i]);
            }
        }
    }
}

//OUTPUT:
//---------------------
//The distinct elements are 
//3
//4
//7
//Time complexity = O(N^2)
//Space complexity = O(N)