package ru.geekbrains.terentev.task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = 2 * arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
