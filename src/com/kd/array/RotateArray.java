package com.kd.array;

public class RotateArray {

	/*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    int[] rotateArrayElement(int arr[], int by){
    	int[] temp1= new int[by];
    	int[] temp2= new int[arr.length];
    	for(int i=0; i<arr.length; i++){
    		if(i<by)
    			temp1[i]=arr[i];
    		else
    			temp2[i-by]=arr[i];
    	}
    	for(int i=0; i<by; i++){
    		temp2[arr.length - by + i] = temp1[i];
    	}
    	return temp2;
    }
    
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        RotateArray rotate = new RotateArray();
        int arr[] = {11, 12, 23, 44, 55, 66, 77};
       /* rotate.leftRotate(arr, 4, 7);
        rotate.printArray(arr, 7);*/
        for(int i: rotate.rotateArrayElement(arr, 4)){
        	System.out.println(i);
        }
    }
	
}
