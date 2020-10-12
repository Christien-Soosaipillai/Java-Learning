package com.christien.basics.arrays;

import java.util.Arrays;

public class QuickSort {

    /*
     * Quick Sort
     *
     * Like Merge sort, quick sort is a divide and conquer algorithm. It picks an element as a pivot and partitions the
     * given array around the picked pivot. There are many different versions of quicksort that pick pick pivot in different ways:
     *
     * 1. Always pick the first element as pivot
     * 2. Always pick last element as pivot
     * 3. Pick a random element as pivot
     * 4. Pick median as pivot
     *
     * 
     *
     * */

    public void sort(int[] arr, int start, int end){

        if(start < end){                            // if our start position is the beginning and our partitionIndex is less than or equal to our start then we have an invalid array trying to be partitioned

            int partitionIndex = partition(arr, start, end);
            sort(arr, start, partitionIndex - 1);
            sort(arr, partitionIndex+1, end);
        }
        System.out.println(Arrays.toString(arr));
    }

    //the whole point here is to move smaller elements to the bottom of the array
    public Integer partition(int[] arr, int start, int end){

        int pivot = arr[end];                       // we have chosen pivot as the last index in the array
        int partitionIndex = start;
        for(int i = start; i < end; i++){           // go from start of array/subarray to end
            if(arr[i] <= pivot){                    // if the element at i is less than that of the element at pivot
                swap(arr, i, partitionIndex);       // then we swap
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, end);
        return partitionIndex;
    }

    public void testSwap(){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
