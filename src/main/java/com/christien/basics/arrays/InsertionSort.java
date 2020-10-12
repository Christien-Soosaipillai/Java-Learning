package com.christien.basics.arrays;

import java.util.Arrays;

public class InsertionSort {

    /*
     * 3.Insertion Sort
     *
     * The array is virtually split into a sorted and unsorted array. We start at the 2nd index in the array(arr[1]) and
     * move this key up. we compare i to the previous values in the array until we find a value  We set 'j' equal to the previous index (j = i - 1), and continue to move j down the array based
     * on the condition j is greater than or equal to 0 (j >= 0) and that the value at arr[j] is greater than our current key. We could consider this as the opposite of bubble sort since
     * it MOVES THE SMALLEST NUMBERS DOWN the array
     *
     *
     * */

    public void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key ){
                    arr[j + 1] = arr[j];
                    j = j -1;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void sortWithLogger(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            int[] temp = arr.clone();
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
            System.out.println(Arrays.toString(temp) + "---->" + Arrays.toString(arr) + " moved: " + key + " to " + (j+1));
        }
    }


}
