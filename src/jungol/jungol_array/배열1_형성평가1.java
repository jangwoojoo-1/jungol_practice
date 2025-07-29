package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_형성평가1 {
    public static void main(String[] args) {
        char[] char_array = new char[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 10 ; i++){
            char_array[i] = sc.next().charAt(0);
        }

        for (int i = 9 ; i >= 0 ; i--){
            System.out.printf("%c ", char_array[i]);
        }

    }
}
