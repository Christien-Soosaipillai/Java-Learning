package com.christien.basics.arrays;

import java.util.Arrays;

public class BubbleSort {

    /*
    * 2.Bubble Sort
    *
    * The bubble sort works by repeatedly swapping the adjacent elements in an array if they are wrong. We start at arr[0]
    * arr[1]. If arr[0] < arr[1] we swap. We are basically trying to "MOVE THE BIGGEST NUMBER TO THE TOP" upon each loop.
    * The outer for loop is in charge of keeping position of each individual element in the array while the inner loop does
    * multiple passes of the array.
    *
    * The condition to iterate through the array for the inner loop is set at arr.length-i-1. The reason we do this is
    * because once we have pushed the biggest element to the top of the array we no longer have to waste time comparing
    * to the last element we touched. So to preserve time we subtract the outer array index, i, from the arr.length and
    * subtract 1 as well to guarantee that we dont waste time comparing elements at the top of the array that are already
    * in the correct space
    *
    * */


    public void sort(int[] arr){

        int key = 0;
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void sortWithLogging(int[] arr){

        int key = 0;
        for(int i=0; i < arr.length-1; i++){
            int[] tempArr;
            for(int j=0; j < arr.length-i-1;j++) {
                tempArr = arr.clone();
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(tempArr)+"---->"+Arrays.toString(arr) + " comparing '" + (arr[j+1]) + "' with '" + arr[j]  +"'.......swapped!");
                }else{
                    System.out.println(Arrays.toString(tempArr)+"---->"+Arrays.toString(arr) +  " comparing '" + (arr[j+1]) + "' with '" + arr[j]  +"'.......NO SWAP!");
                }
            }
            System.out.println("looping...");
        }
    }

}
