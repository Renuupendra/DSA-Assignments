package com.lm.arrays1D;

public class SecondLargeNum 
{
    public static void main(String args[]) 
    {
        SecondLargeNum obj = new SecondLargeNum();
        int []arr = {1,2,3,4,5,6,2,8,25,42};
        int num = obj.secondLargest(arr);
        System.out.println("The second largest number in the given array is = "+num);
    }
    public int secondLargest(int [] arr)
    {
        int large = arr[0];
        int secondLargestNumber=arr[1];
        
        for(int i=1;i<arr.length;i++)
        {
            
            if(large<arr[i]) 
            {
                secondLargestNumber=large;
                large = arr[i];
            }
            else if(secondLargestNumber<arr[i])
            {
                secondLargestNumber=arr[i];
                
            }
        }
        return secondLargestNumber;
    }
}

//Output:
//-----------
//The second largest number in the given array is = 25
//Time complexity = O(N)
//Space Complexity = O(1)