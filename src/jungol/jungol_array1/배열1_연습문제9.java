package jungol.jungol_array1;

import java.util.Arrays;

public class 배열1_연습문제9 {
    public static void main(String[] args) {
        Integer[] num_array = {95, 75, 85, 100, 50};

        Arrays.sort(num_array);

        for (int i : num_array) {
            System.out.print(i + " ");
        }
    }
}
