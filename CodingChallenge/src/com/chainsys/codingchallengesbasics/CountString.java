package com.chainsys.codingchallengesbasics;

import java.util.Scanner;

public class CountString 
{

	    public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        if(!scan.hasNext())
	        {
	        	System.out.println(0);
	        }
	        else
	        {
	        	String sentence = scan.next();
	        	String[] split = sentence.trim().split(("[ !,.@-_]"));
	        	
	        }
	        for()
	        scan.close();
	    }
	}