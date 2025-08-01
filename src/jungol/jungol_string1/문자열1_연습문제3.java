package jungol.jungol_string1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열1_연습문제3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "jungol olympiad";

        printIndexCh(string);
    }

    public static void printIndexCh(String s){
        int[] indexes = new int[5];
        int i = 0;

        while(true){
            try{
                int n = sc.nextInt();
                if(n > 14 || n < 0){
                    continue;
                }
                indexes[i++] = n;
                if(i > 4){
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("숫자만 입력해주세요.");
            }
        }

        for (int j = 0; j < indexes.length; j++) {
            int index = indexes[j];
            System.out.printf("%c", s.charAt(index));
        }
    }
}
