package com.example.mywebapp.programs;

/**
 * @author Ankush Mohapatra
 * */
public class MergeSort {

	void mergeSort(int arr[])
	{
		// get the array length
		int arrSize = arr.length; 

		// returns if size of array is 1 (as one element in array is already sorted)
		if(arrSize == 1)
			return;
		
		// find the middle index of the array
		int mid = arrSize /2;
		
		// initializing the size of left and right sub Array
		int left[] = new int[mid];
		int right[] = new int[arrSize-mid];
		
		// initializing the left and right array
		for(int i=0; i<mid; i++)
		{
			left[i] = arr[i];
		}
		for(int i=mid; i<arrSize; i++)
		{
			right[i-mid] = arr[i];
		}
		
		mergeSort(left); // sorting the left array (recursively)
		mergeSort(right); // sorting the right array (recursively)
		merge(left, right, arr); // invoking merge method 
	
	}
	
	// merge() method
	void merge(int left[], int right[], int arr[])
	{
		int lL = left.length; int rL = right.length;
		int i=0, j=0, k=0;
		
		//Merging the temp arrays to final array
		while (i <lL && j < rL) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < lL)
		{
			arr[k] = left[i];
			i++; k++;
		}
		
		while(j < rL)
		{
			arr[k] = right[j];
			j++; k++;
		}
	}
	
	// method to print an array
	static void printArray(int arr[]) 
	{ 
	    int i; 
	    for (i=0; i < arr.length; i++) 
	    	System.out.print(arr[i] + " "); 
        System.out.println(); 
	}
	
	// driver method
	public static void main(String[] args) {
		int arr[] = {3,4,1,7,6,2,8};
		
		System.out.println("Given Array"); 
        printArray(arr);
        
        // sort the given array by mergeSort()
		new MergeSort().mergeSort(arr);
		
		System.out.println("\nSorted array");
		printArray(arr);
		
	}
}
