package org.study.example.integer;

import java.util.List;

public class MainInteger {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 7, 6, 1};
        List repeted = IntegerUtil.repeted(array);
        for (Object element : repeted) {
            System.out.println(element);
        }
    }

}
