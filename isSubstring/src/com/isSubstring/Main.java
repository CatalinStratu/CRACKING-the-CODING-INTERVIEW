package com.isSubstring;

import java.util.*;

public class Main {

    // Method to sort a string alphabetically
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    public static boolean isSubstring(String s1, String s2){
        String str1 = sortString(s1);
        String str2 = sortString(s2);
        int len1 = str1.length(), len2 = str2.length();
        if(len1 != len2){
            return false;
        }
        for(int i = 0; i<len1;i++ ){
            if(str1.charAt(i)!= str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
	    // write your code here
        String mystr1 = "waterbottle";
        String mystr2 = "erbottlewas";
        System.out.println(isSubstring(mystr1,mystr2));
    }
}
