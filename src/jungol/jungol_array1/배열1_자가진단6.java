package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_자가진단6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] num_array = new Integer[10];

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
        }

        Arrays.sort(num_array);
        System.out.println(num_array[0]);
    }
}
