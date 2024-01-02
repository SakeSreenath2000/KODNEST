package com.kodnest.NestedSimpleifStatement;
import java.util.Scanner;
public class ClothingAdvisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the temperature outside (in degrees Fahrenheit)? ");
        int temp = scan.nextInt();
        if (temp > 80) {
            System.out.println("It's hot outside. Wear shorts and a t-shirt.");
        } else {
            if (temp >= 60) {
                System.out.println("It's mild outside. A light sweater and jeans should be good.");
            } else {
                System.out.println("It's cold outside. Put on a jacket and some warm pants.");
            }
        }
        scan.close();
    }
}

