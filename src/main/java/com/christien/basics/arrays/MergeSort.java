package com.christien.basics.arrays;

import java.util.Arrays;

public class MergeSort {

    /*
    *
    * 4.Merge Sort
    *
    * Merge sort is a divide and conquer algorithm. It divides the input array into 2 halves, calls itself for the
    * 2 halves and then merges the 2 sorted halves. This splitting is done recursively until there is only one element at
    * the bottom of the final call of splitting finally the merge function is called to sort the array and merge the halves
    * back. The steps are as follows
    *
    * if(arrLength > =2){
    * 1. Find the middle point to divide the array into 2 halves
    *   - middle = array / 2;
    * 2. Call mergesort() on the first half(left side)
    *   - merge(int[] leftArray)
    * 3. Call mergesort() on the other half(right side)
    *   - merge(int[] rightArray)
    * 4. Finally call merge() on 2 halves and the array that stores the numbers
    *   -merge(left[], right[], arr[]);
    * }
    *
    *
    * */



    public void sort(int[] arr){

        int arrLength = arr.length;
        if(arrLength >= 2){                                         //only run the sort if the arrary length greater than or equal to 2
            int mid = arrLength/2;                                  //get mid point(for odd numbers the first half of the array will have the shorter side)
            int left = mid;
            int right = arrLength - mid;
            int[] lArr = new int[left];                             //create temp arrays for left and right side using for loops
            int[] rArr = new int[right];
            for(int i=0; i < mid; i++){                             //copy bottom half array
                lArr[i] = arr[i];
            }
            for(int i=0; i < arrLength-mid; i++){                   //copy top half array
                rArr[i]= arr[mid+i];
            }
            sort(rArr);                                             //call sort on bottom half
            sort(lArr);                                             //call sort on top half
            merge(lArr, rArr, arr);                                 //call merge on both arrays and pass original array to hold values
        }
        System.out.println(Arrays.toString(arr));
    }



    private int[] merge(int[] left, int[] right, int[] arr){
        int lengthLeft = left.length;
        int lengthRight = right.length;
        int i=0, j=0, k=0;
        while(i < lengthLeft && j < lengthRight){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < lengthLeft){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < lengthRight){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }



}
