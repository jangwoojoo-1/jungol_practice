package jungol.jungol_string2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열2_자가진단11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = inputInt();
        int num2 = inputInt();
        int num3 = inputInt();
        int num4 = inputInt();
        int num5 = inputInt();


        StringBuffer sb1 = new StringBuffer();
        sb1.append(Integer.toString(num1));
        sb1.append(Integer.toString(num2));
        sb1.append(Integer.toString(num3));
        sb1.append(Integer.toString(num4));
        sb1.append(Integer.toString(num5));
        String result = sb1.toString();

        for (int i = 0; i < result.length(); i+=3) {
            int end = Math.min(i+3, result.length());
            System.out.println(result.substring(i, end));
        }
    }

    public static int inputInt(){
        while(true){
            try{
                int num = sc.nextInt();
                if(num < 1 || num > Integer.MAX_VALUE) continue;
                return num;
            } catch (InputMismatchException e){
                System.out.println("실수를 입력해주세요.");
                sc.next();
            }
        }
    }

}
