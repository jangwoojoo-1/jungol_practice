package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] char_array = new char[11];

        for(int i = 0 ; i < 10 ; i++){
            char_array[i] = sc.next().charAt(0);
        }

        for(int i = 0 ; i < 10 ; i++){
            System.out.printf("%c", char_array[i]);
        }
    }
}
