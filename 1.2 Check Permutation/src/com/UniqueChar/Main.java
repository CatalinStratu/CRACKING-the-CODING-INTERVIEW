package com.UniqueChar;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Title : Cracking the coding interview
 * 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other
 */
public class Main {
    public static boolean peremutation(String str1, String str2){
        int size1,size2;
        size1 = str1.length();
        size2 = str2.length();
        if (size1!=size2){
            return false;
        }
        // String to char array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<size1; i++){
            if(arr1[i]!= arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean peremutation2(String str1, String str2){
        // Declare HashMap
       HashMap<Character, Integer> ch =new HashMap<>();
       int nr1, nr2;
       nr1 = str1.length();
       nr2 = str2.length();
       if(nr1!=nr2){
           return false;
       }
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();

       for(int i=0;i<nr1;i++){
           ch.put(arr1[i],1);
       }
       for(int j = 0; j<nr1; j++) {
            if(!ch.containsKey(arr2[j])) {
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(""+peremutation("qweasdzxc","cxzdsaewq"));
        System.out.println(""+peremutation2("qweasdzxc","cxzdsaewq"));
    }
}
