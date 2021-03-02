package com.UniqueChar;

import java.util.HashMap;
/**
 * Title : Cracking the coding interview
 * 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class Main {
    public static boolean UniqueChararacter(String str){
        HashMap<Character,Integer> character=new HashMap<>();
        // Creating array of string length
        char[] chArray;

        // Copy character by character into array
        chArray = str.toCharArray();

        for(Character ch: chArray)
        {
            if(character.containsKey(ch)) {
                return false;
            } else{
                character.put(ch,1);
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Boolean result = UniqueChararacter("1234");
        System.out.println(result);
    }

}
