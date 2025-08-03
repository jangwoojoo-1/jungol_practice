package jungol.jungol_string2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열2_형성평가6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String A = inputString();
        String B = inputString();
        int n = inputInt();

        StringBuffer sb1 = new StringBuffer();
        sb1.append(A);
        sb1.append(B);
        A = sb1.toString();

        System.out.println(A);
        
        B= B.replace(B.substring(0, Math.min(n, B.length())), A.substring(0, Math.min(n, A.length())));

        System.out.println(B);

    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() > 100){
                continue;
            }
            return string;
        }
    }

    public static int inputInt(){
        while(true){
            try{
                int num = sc.nextInt();
                if(num < 1 || num > 100) continue;
                return num;
            } catch (InputMismatchException e){
                System.out.println("실수를 입력해주세요.");
                sc.next();
            }
        }
    }

}
