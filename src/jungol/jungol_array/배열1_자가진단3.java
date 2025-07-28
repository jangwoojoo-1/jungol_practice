package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] char_array = new char[10];

        for (int i = 0 ; i < 10 ; i++){
            char_array[i] = sc.next().charAt(0);
        }

        System.out.printf("%c %c %c", char_array[0], char_array[3], char_array[6]);
    }
}
