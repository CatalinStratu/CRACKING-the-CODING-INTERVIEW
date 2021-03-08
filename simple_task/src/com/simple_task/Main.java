package com.simple_task;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Max value
    public static int Maxvalue(int[] arr){
        int max = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    // median of an array
    public static int Median_an_array(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i< arr.length;i++){
            sum += arr[i];
        }
        return sum/n;
    }
    // Reverse array
    public static int[] reverse_arr(int[] arr){
        int temp = 0;
        int n = arr.length;
        for(int i= 0; i<n/2; i++){
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        return  arr;
    }
    //Binnary search
    public static int binarySearch(int array[], int element, int low, int high) {

        while (low<= high){
            int middle = low + (high - low)/2;
            if(array[middle] == element){
                return middle;
            } else if(array[middle]< element){
                low = middle;
            } else if(array[middle] > element){
                high = middle;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] a = {1,1,3,2,8,10,100,10,1};
        int n = a.length-1;
        System.out.println("Max value of this array is " + Maxvalue(a));
        System.out.println("median of an array " + Median_an_array(a));
       // reverse_arr(a);
        Arrays.sort(a);
        for(int i = 0; i<n;i++){
            System.out.println("Position"+i+"Element :"+a[i]);
        }
        System.out.println("Position" + binarySearch(a,2,0,n));
        System.out.println("Position" + (8-5)/2);

    }
}
