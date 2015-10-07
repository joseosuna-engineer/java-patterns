package org.study.example.sort;

import java.util.Arrays;

public class IntegerSort {

    public static void reverse(int[] array) {

        try {
            if (array == null) {
                return;
            }
            int top = array.length - 1;
            int base = 0;
            int temp;

            while (base < top) {
                temp = array[base];
                array[base] = array[top];
                array[top] = temp;
                --top;
                ++base;
            }

        } catch (ArrayIndexOutOfBoundsException ex) {

        }
    }

    public static void descSort(int[] array) {
        try {
            if (array == null) {
                return;
            }

            Arrays.sort(array);
            reverse(array);

        } catch (ArrayIndexOutOfBoundsException ex) {

        }
    }
}
