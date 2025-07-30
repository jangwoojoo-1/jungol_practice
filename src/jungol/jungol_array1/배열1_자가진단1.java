package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] char_array = new char[11];

        for(int i = 0 ; i < char_array.length ; i++){
            char_array[i] = sc.next().charAt(0);
        }

        for(int i = 0 ; i < char_array.length ; i++){
            System.out.printf("%c", char_array[i]);
        }
    }
}
