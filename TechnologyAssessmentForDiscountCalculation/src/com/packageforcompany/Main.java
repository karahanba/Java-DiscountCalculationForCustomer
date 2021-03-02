package com.packageforcompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("1) Is product a phone?:boolean, Type 'True' or 'False'");
            System.out.println("2) Enter number for user status; '1' Gold, '2' Silver, '3' Affiliate, '4' Not Defined");
            System.out.println("3) Is user a customer over 2 years?:Type Y/N");
            System.out.println("4) Enter total shopping amount in $, use coma for double values.\n Please type in the" +
                    " variables as requested and Press Enter after each input...");

            Scanner scanner = new Scanner(System.in);
            UserVariables userVariables1 = new UserVariables(scanner.nextBoolean(), scanner.nextInt(),
                    scanner.next().toUpperCase(), scanner.nextDouble());

            userVariables1.calculatePercentageDiscount();
            userVariables1.calculateExtraDiscount();
            userVariables1.calculateBill();

            userVariables1.showVariables();
        }
        catch (Exception e){System.out.println(e);}
    }
}
