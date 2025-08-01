package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = inputString();
        String str2 = inputString();

        StringBuffer str = new StringBuffer(str2);
        str.append(str1);
        String result = str.toString();

        System.out.println(result);
    }

    public static String inputString(){
        while(true){
            String string = sc.next();
            if(string.length() >= 10){
                continue;
            }
            return string;
        }
    }
}
