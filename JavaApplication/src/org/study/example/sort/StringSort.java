package org.study.example.sort;

public class StringSort {

    public static void reverse(char[] array) {

        try {
            if (array == null) {
                return;
            }
            int top = array.length - 1;
            int base = 0;
            char temp;

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

    public static void recursiveReverse(char[] array, int top, int base) {

        try {
            if (array == null) {
                return;
            }

            char temp;

            if (base > top) {
                return;
            }

            temp = array[base];
            array[base] = array[top];
            array[top] = temp;

            recursiveReverse(array, top - 1, base + 1);

        } catch (ArrayIndexOutOfBoundsException ex) {

        }
    }
}
