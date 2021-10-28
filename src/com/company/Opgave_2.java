package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("Datafile.txt");
        Scanner scanner = new Scanner(data);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        print(array);
        gennemsnit(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        print(array);
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
