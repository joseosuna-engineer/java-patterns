

package org.example.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class IntegerUtil {

    public static List repeted(int[] array) {
        List output = new ArrayList();
        if (array == null) {
            return output;
        }
        try {
            int index;
            Arrays.sort(array);
            index = array[0];
            for (int element : array) {
                if ((element == index)&&(!output.contains(element))) {
                    output.add(element);
                } else {
                    index = element;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return output;
    }
}
