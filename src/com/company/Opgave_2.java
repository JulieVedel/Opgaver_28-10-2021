package com.company;

import java.io.*;
import java.io.FileOutputStream;
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
        writeFile(array);

        print(array);
        gennemsnit(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        print(array);
        writeFile(array);
        writeDatafile(array);
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

    public static void writeFile(int[] array) {
        try {
            PrintWriter file = new PrintWriter("Datafile.txt");
            for (int i = 0; i < array.length; i++) {
                file.println(array[i]);
            }
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeDatafile(int[] array) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream("file.dat");
        try {
            for (int i = 0; i < array.length; i++) {
                file.write(array[i]);
            }
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
