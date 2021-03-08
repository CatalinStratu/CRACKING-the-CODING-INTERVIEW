package com.Mysearch;
import java.util.Arrays;
public class Main {
    public static int BinarySearch(int[] arr, int x){
        int low,high;
        low = 0;
        high = arr.length-1;
        while (low <= high){
            int middle = low +(high-low)/2; // Middle element
            if(arr[middle]== x ){
                return middle;
            } else if(arr[middle] < x){
                low = middle + 1;
            } else if(arr[middle] > x){
                high = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(array);
        System.out.println("Binary Search  element:" + BinarySearch(array,5));
    }
}
