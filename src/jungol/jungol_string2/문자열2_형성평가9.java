package jungol.jungol_string2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열2_형성평가9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = inputInt();
        double double1 = inputDouble();
        String str1 = inputString();

        StringBuffer sb1 = new StringBuffer();
        sb1.append(Integer.toString(num1));
        sb1.append(String.format("%.3f", double1));
        sb1.append(str1);
        String newStr = sb1.toString();


        System.out.println((newStr.length()%2 == 0) ? newStr.substring(0, newStr.length()/2) : newStr.substring(0, newStr.length()/2+1));
        System.out.println((newStr.length()%2 == 0) ? newStr.substring(newStr.length()/2) : newStr.substring(newStr.length()/2+1));
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() > 30){
                continue;
            }
            return string;
        }
    }

    public static int inputInt(){
        while(true){
            try{
                int num = sc.nextInt();
                if(Integer.toString(num).length() > 30) continue;
                return num;
            } catch (InputMismatchException e){
                System.out.println("정수를 입력해주세요.");
                sc.next();
            }
        }
    }

    public static double inputDouble(){
        while(true){
            try{
                double num = sc.nextDouble();
                if(Double.toString(num).length() > 30) continue;
                return num;
            } catch (InputMismatchException e){
                System.out.println("실수를 입력해주세요.");
                sc.next();
            }
        }
    }
}
