package com.christien.basics.arrays;

import java.math.BigDecimal;

public class Sorter {

    /*
    * Big O: How time scales with respect to some input variables; specifically descries the 'WORST-CASE' scenario, and
    *       can be used to describe the execution time required or space used(i.e in memory) by an algorithm
    *
    *  Rules to consider:
    *  1. different steps get added(step1: O(a), step2: O(b) total= O(a+b))
    *  2. drop constants(If I have a function with 2 loops that each run a similar process of O(n) in total I wouldn't say 0(2n)
    *       I would say  0(n))
    *  3. different inputs use different variables to represent them
    *  4. drop the non dominant term( if I have a function with 2 for loops where one is O(n) and the other is O(n^2) I WOULDN'T say
    *       the Big O of the function is O(n*n^2) I would just say O(n^2) because the n^2 drives how the run time changes)
    * 
    * */

    public static void main(String[] args){

        int[] arr = {4,10,3,5,1};
        final double conversion = 1000000000.0;

        //Selection Sort
        System.out.println("-- Selection Sort --");
        SelectionSort selectionSort = new SelectionSort();
        double startTime = System.nanoTime();
        selectionSort.sortWithLogging(arr.clone());
        double duration = System.nanoTime() - startTime;
        System.out.println("Selection Sort Time: " + BigDecimal.valueOf(duration/conversion).toPlainString()+"s\n");

        //Bubble Sort
        System.out.println("-- Bubble Sort --");
        BubbleSort bubbleSort = new BubbleSort();
        startTime = System.nanoTime();
        bubbleSort.sortWithLogging(arr.clone());
        duration = System.nanoTime() - startTime;
        System.out.println("Bubble Sort Time: " + BigDecimal.valueOf(duration/conversion).toPlainString()+"s\n");

        //Insertion Sort
        System.out.println("-- Insertion Sort --");
        InsertionSort insertionSort = new InsertionSort();
        startTime = System.nanoTime();
        insertionSort.sort(arr.clone());
        duration = System.nanoTime() - startTime;
        System.out.println("Insertion Sort Time: " + BigDecimal.valueOf(duration/conversion).toPlainString()+"s\n");


        //Merge Sort
        System.out.println("-- Merge Sort --");
        MergeSort mergeSort = new MergeSort();
        startTime = System.nanoTime();
        mergeSort.sort(arr.clone());
        duration = System.nanoTime() - startTime;
        System.out.println("Merge Sort Time: " + BigDecimal.valueOf(duration/conversion).toPlainString()+"s\n");

        //Quick Sort
        System.out.println("-- Quick Sort --");
        QuickSort quickSort = new QuickSort();
        startTime = System.nanoTime();
        quickSort.sort(arr.clone(),0, arr.length-1);
//        quickSort.testSwap();
        duration = System.nanoTime() - startTime;
        System.out.println("Quick Sort Time: " + BigDecimal.valueOf(duration/conversion).toPlainString()+"s\n");


        //Heap Sort
        System.out.println("-- Heap Sort --");
        HeapSort heapSort = new HeapSort();
        startTime = System.nanoTime();
        heapSort.sort(arr.clone());
//        quickSort.testSwap();
        duration = System.nanoTime() - startTime;
        System.out.println("Heap Sort Time: " + BigDecimal.valueOf(duration/conversion).toPlainString()+"s\n");


    }

}
