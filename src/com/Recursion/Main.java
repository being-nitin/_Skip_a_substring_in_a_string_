package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	skip "apple" in a given string.
	 */
        String str = "bccapplenit";
        System.out.println(skipApple(str));

    }
    public static String skipApple(String str){
        if(str.isEmpty()){
            return " ";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else{
            return str.charAt(0)+skipApple(str.substring(1));
        }
    }

}
/* in this we are checking that if the string starts with apple them we will skip it by starting the next
   recursive call after the length of the given word that is apple.
 */
