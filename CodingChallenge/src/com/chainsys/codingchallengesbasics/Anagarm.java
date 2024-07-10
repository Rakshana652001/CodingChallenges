package com.chainsys.codingchallengesbasics;

import java.util.Arrays;
import java.util.Scanner;
public class Anagarm 
{
	static boolean isAnagram(String a, String b) {
	        // Complete the function
	        boolean flag = false;
	        a=a.toLowerCase();
	        b=b.toLowerCase();
	         char[] firstString = a.toCharArray();
	         char[] secondString = b.toCharArray();
	         
	         Arrays.sort(firstString);
	         Arrays.sort(secondString);
	         
	         String first = new String(firstString);
	         String second = new String(secondString);
	         if(first.equals(second))
	         {
	             flag = true;
	         }
	         else flag = false;
	         
	         return flag;
	         
	         
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the second string : ");
	        String a = scan.next();
	        System.out.println("Enter the second string : ");
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

