package com.bridgelabz.junit;

import jdk.jshell.execution.Util;

public class CalculateMonthlyPayment {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        double payment;
        double ret = Util.payment(x, y, z);
        System.out.println("payment is: "+ret);
     }
}

