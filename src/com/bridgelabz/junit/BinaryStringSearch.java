package com.bridgelabz.junit;

import java.util.Scanner;

import jdk.jshell.execution.Util;

public class BinaryStringSearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "xyz"};
            String x = "xyz";
            int result = Util.binarySearchString(arr, x);

            if(result == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element fount at psition "+result);
        }
    }

