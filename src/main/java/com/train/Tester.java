package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int var;
        float totalPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets :");
        String num = scanner.next();
        System.out.println("How many round-trip tickets :");
        String returnNum = scanner.next();
        CalcuTicket cal = new CalcuTicket(Integer.valueOf(num), Integer.valueOf(returnNum));
        totalPrice = cal.getPrice();
        System.out.println("Total tickets:" +num+ " Round-trip: " +returnNum+ "Total:"+totalPrice);
    }
}
