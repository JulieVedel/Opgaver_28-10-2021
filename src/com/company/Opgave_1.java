package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Opgave_1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.format("Indtast den %d. værdi.\n", i + 1);

            array[i] = scanner.nextInt();
        }
        print(array);
        gennemsnit(array, array.length);
    }

    public static void print(int[] array) {
        System.out.println("Værdierne i arrayet er: " + Arrays.toString(array));
    }

    public static void gennemsnit(int[] array, int count) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Gennemsnittet af værdierne i arrayet er: " + (sum / count));
    }
}

