package com.bridgelabz.junit;

import java.util.*;


public class TemperatureConversion {
    public static void main(String[] args) {
        double ftemp,ctemp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter temperature in Celsius : ");
        ctemp=sc.nextDouble();
        System.out.println("Temperature in Fahrenheit : "+Util.ToFahrenheit(ctemp));

        System.out.println("Enter temperature in Fahrenheit : ");
        ftemp=sc.nextDouble();
        System.out.println("Temperature in Celsius : "+
                Util.ToCelsius(ftemp));
    }
}
