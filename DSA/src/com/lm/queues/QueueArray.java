package com.lm.queues;

public class QueueArray {
	
 static class queue
 {
     static int arr[];
     static int size;
     static int back;
     queue(int n)
     {
         size = n;
         arr = new int[size];
         back = -1;
     }
     public static boolean isEmpty()
     {
         return back == -1;
     }
     public static boolean isFull()
     {
         return back == size-1;
     }
     
     
     // enqueue
     public static void add(int data)
     {
         if(isFull())
         {
             System.out.println("Overflow");
             return;
         }
         arr[++back]=data;
         
     }
     //dequeue
     public static int remove()
     {
         if(isEmpty())
         {
             System.out.println("Queue is Empty");
             return -1;
         }
         int front = arr[0];
         for(int i=0 ; i<back ; i++)
         {
             arr[i]=arr[i+1];
         }
         back--;
         return front;
     }
     public static int peek()
     {
         if(isEmpty())
         {
             System.out.println("Queue is Empty");
             return -1;
         }
         return arr[0];
     }
     
 }
 public static void main(String[] args)
 {
     queue q = new queue(5);
     q.add(17);
     q.add(67);
     q.add(56);
     
   while(!q.isEmpty())
   {
       System.out.println(q.peek());
       q.remove();
   }
 }
}
