package com.christien.basics.arrays;

import java.util.Arrays;

public class SelectionSort {

    /*
    * 1.Selection Sort
    *
    * The selection sort algorithm sorts an array by repeatedly looking for the minimum element and placing it at the
    * beginning of the array. the outer for loop keep tracks of the initial position of the element we are comparing. As
    * we continue through the array if we find an element smaller than that position then we make it the new minimum.
    * Once we reach the end of the array from the inner for loop we then swap out the intial position with out new min value
    *
    *
    *
    * */
//    {2,7,4,1,5,3,4,3,2,1}
    public void sort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void sortWithLogging(int[] arr){

        for(int i = 0; i < arr.length;i++){
            int minIndex = i;
            int[] tempArr = arr.clone();
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(tempArr)+"---->"+Arrays.toString(arr) + " swapped '" + (temp) + "' with '" + arr[i]  +"'");
        }

    }


}
