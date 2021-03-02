package com.URLif;
/**
 * Title : Cracking the coding interview
 * 1.3 URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE:
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 */
public class Main {
    public static String urlif(String s){
        String url = s.replaceAll(" ","%20");
        return url;
    }
    public static void main(String[] args) {
        System.out.println(urlif("Buna ce mai faci?"));
    }
}
