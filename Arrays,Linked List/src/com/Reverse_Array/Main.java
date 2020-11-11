package com.Reverse_Array;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the array :");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] MainArray = readArray(count);
        System.out.println("Non Reversed Array ->");
        printArray(MainArray);
        int[] reverseArray = reverseArray(MainArray);
        System.out.println("Reversed Array ->");
        printArray(reverseArray);
    }

    private static int[] readArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " 'th element");
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + "'th value is " + array[i]);
        }
    }

    private static int[] reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length - i - 1; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
