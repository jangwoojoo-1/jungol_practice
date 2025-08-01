package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;

        while(loop){
            char c = sc.next().charAt(0);
            loop = descChar(c);
            
        }
    }
    
    public static boolean descChar(char c){
        if(c >= 97 && c <= 122){
            System.out.println("소문자입니다.");
            return true;
        }
        if (c >= 65 && c <= 90) {
            System.out.println("대문자입니다.");
            return true;
        }
        if (c >= 48 && c <=  57) {
            System.out.println("숫자문자입니다.");
            return true;
        }

        System.out.println("영문, 숫자 이외의 문자입니다.");
        return false;
    }
}
