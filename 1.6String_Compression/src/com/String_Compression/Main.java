package com.String_Compression;
import java.lang.*;
public class Main {
    public static String Compression(String myArray){
        char[] arr = myArray.toCharArray();
        int counter=0;
        char last = arr[0];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== last){
                counter++;
            } else {
                str.append(last);
                str.append(counter);
                last=arr[i];
                counter = 1;

            }
        }
        str.append(last);
        str.append(counter);
        return str.toString();

    }
    public static void main(String[] args) {
	// write your code here
        String arr="aabcccccaaa";
        System.out.println( Compression(arr));
    }
}
