package jungol.jungol_string1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열1_자가진단1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        translateInputNumToAscii();
    }

    public static void translateInputNumToAscii(){
        while(true){
            try{
                System.out.print("ASCII code =? ");
                int n = sc.nextInt();

                if(n < 33 || n > 127) break;

                System.out.println((char)n);
            } catch (InputMismatchException e){
                System.out.println("숫자를 입력하세요.");
            }
        }
    }
}
