package com.MinElementInArray;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the array :");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] mainArray = readIntegers(count);
        int minValue = findMin(mainArray);

        System.out.println("Minimum value of the array is :" + minValue);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter "+(i+1)+" 'th number :");
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
