package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] charArr = new char[3][5];

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                char c1 = sc.next().charAt(0);
                while((int)c1 > 90 || (int)c1 < 65){
                    c1 = sc.next().charAt(0);
                }
                charArr[i][j] = c1;
            }
        }

        for (char[] chars : charArr) {
            for (char aChar : chars) {
                System.out.printf("%c ", Character.toLowerCase(aChar));
            }
            System.out.println();
        }
    }
}