package com.algo.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i =0; i<arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }

        System.out.println("Array before: " + Arrays.toString(arr));

        int[] sortedArr = solution(arr);

        System.out.println("Array after: " + Arrays.toString(sortedArr));

    }

    public static int[] solution(int[] A) {
        if (A.length < 2) {
            return  A;
        }
        int arrLength = A.length;
        int middleIndex = arrLength/2;

        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[arrLength-middleIndex];

        System.arraycopy(A, 0, leftSide, 0, middleIndex);
        System.arraycopy(A, middleIndex, rightSide, 0, rightSide.length);

        solution(leftSide);
        solution(rightSide);

        // merge
        merge(A, leftSide, rightSide);

        // return A again
        return  A;
    }

    public static void merge(int[] A, int[] leftArr, int[] rightArr) {
        int leftLength =  leftArr.length;
        int rightLength = rightArr.length;

        int i =0, j=0, k=0;

        while(i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                A[k] = leftArr[i];
                i++;
            } else {
                A[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < leftLength) {
            A[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightLength) {
            A[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
