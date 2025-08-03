package jungol.jungol_string2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열2_연습문제11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = inputDouble();
        double num2 = inputDouble();
        double num3 = inputDouble();

        StringBuffer sb1 = new StringBuffer();
        sb1.append(String.format("%.2f", num1));
        sb1.append(String.format("%.2f", num2));
        sb1.append(String.format("%.2f", num3));
        String[] result = sb1.toString().split("\\.");

        for (String string : result) {
                System.out.println(string);
        }
    }

    public static double inputDouble(){
        while(true){
            try{
                double num = sc.nextDouble();
                return num;
            } catch (InputMismatchException e){
                System.out.println("실수를 입력해주세요.");
                sc.next();
            }
        }
    }

}
