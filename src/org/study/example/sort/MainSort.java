

package org.study.example.order;



public class MainSort {

    public static void main(String[] args) {
        String array = "abcdefg";
        System.out.println(array);
        char[] cArray = array.toCharArray();
        StringSort.recursiveReverse(cArray, cArray.length - 1, 0);
        try {
            array = new String(cArray);
        } catch (NullPointerException e) {
        }
        System.out.println(array);

        int[] iArray = {5, 1, 6, 4, 1, 0, 6};
        System.out.println("Unordered");
        for (int element : iArray) {
            System.out.println(element);
        }

        IntegerSort.DescSort(iArray);
        System.out.println("Ordered");
        for (int element : iArray) {
            System.out.println(element);
        }
    }
}
