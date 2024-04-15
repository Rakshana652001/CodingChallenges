package com.chainsys.codingchallengesbasics;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N>=2 && N<=20)
        {
            for(int initial=1; initial<=10;initial++)
            {
                int multiply = N*initial;
                System.out.println(N+" x "+initial+" = "+multiply);
            } 
        }
        
        bufferedReader.close();
    }
}

/*Sample Input

2*/