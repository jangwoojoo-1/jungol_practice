package jungol.jungol_string2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            String str = inputString();
            if(str.equals("END")) break;
            printUpsideDown(str);
        }

    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() > 20){
                continue;
            }
            return string;
        }
    }

    public static void printUpsideDown(String s){
        StringBuffer sb1 = new StringBuffer(s);
        sb1.reverse();
        s = sb1.toString();
        System.out.println(s);
    }

}
