package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = sc.nextLine();

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", string.length());

        for(int i = string.length()-1 ; i >= 0 ; i--){
            System.out.print(string.charAt(i));
        }
    }
}
