package jungol.jungol_array1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] outputArray = new Integer[10];
        for (int i = 0; i < outputArray.length; i++) {
            Integer integer = outputArray[i];
            outputArray[i] = sc.nextInt();
        }
        Arrays.sort(outputArray, Collections.reverseOrder());
        System.out.println(outputArray[0]);

    }
}
