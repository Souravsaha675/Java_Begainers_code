package com.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagePrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagePrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagePrinted=printer.printPages(2);
        System.out.println("Pages printed was " + pagePrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
