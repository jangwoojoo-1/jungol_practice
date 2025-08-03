package jungol.jungol_string2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 문자열2_연습문제10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num1 = stringToInt(inputString());
            int num2 = stringToInt(inputString());
            if (num1 == 0 || num2 == 0) continue;

            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
            break;
        }

        while (true) {
            double double1 = stringToDouble(inputString());
            double double2 = stringToDouble(inputString());
            if (double1 == 0.0 || double2 == 0.0) continue;

            System.out.printf("%.2f + %.2f = %.2f\n", double1, double2, double1 + double2);
            break;
        }
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() > 10){
                continue;
            }
            return string;
        }
    }

    public static int stringToInt(String s){
        try{
            return Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("입력된 문자를 정수로 변환할 수 없습니다.");
            return 0;
        }
    }

    public static double stringToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("입력된 문자를 실수로 변환할 수 없습니다.");
            return 0.0;
        }
    }

}
