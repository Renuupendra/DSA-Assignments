package com.lm.DynamicArrays;

public class DynamicArrayList {
	
    int arr[] = new int[5];
    int n = 0;
    
    public void addItem(int value)
    {
        if(n == arr.length)
        {
            int newArr[] = new int[arr.length*2]; 
            for(int i=0;i<arr.length;i++)
            {
                newArr[i] =  arr[i];
            }
            arr=newArr;
        }
        arr[n] = value;
        n++;
       
    }
    
    public void removeItem()
    {
        arr[n]=-1;
        n--;
    }
    public void insertAt(int index,int value)
    {
        if(n == arr.length)
        {
            int newArr[] = new int[arr.length*2]; 
            for(int i=0;i<arr.length;i++)
            {
                newArr[i] =  arr[i];
            }
            arr=newArr;
        }
        for(int i=n;i>=index;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        n++;
    }

    public void removeAt(int index)
    {
        for(int i=index;i<=n;i++)
        {
            arr[i] = arr[i+1];
        }
        n--;

    }
    public void getSize()
    {
        System.out.println("size"+n);
    }
    public void getCapacity()
    {
        System.out.println("capacity"+arr.length);
    }
    public int getElementAt(int index)
    {
        return arr[index];
    }
    public boolean GetElement(int value)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]== value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
    	
        DynamicArrayList d = new DynamicArrayList();
        
        d.addItem(3);
        d.addItem(26);
        d.insertAt(3, 21);
        
        System.out.println(d.getElementAt(1));
        System.out.println(d.GetElement(30));
        System.out.println("final array is :");
        
        for(int i=0;i<d.n;i++)
        {
            System.out.println(d.arr[i]);
        }

    }

}