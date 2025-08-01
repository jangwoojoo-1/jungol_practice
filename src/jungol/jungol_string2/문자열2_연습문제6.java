package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(inputString());
        StringBuffer sb2 = new StringBuffer(inputString());

        sb2.append(sb1.substring(0, 3));
        sb1.replace(0,3, sb2.substring(0,3));

        String str1 = sb1.toString();
        String str2 = sb2.toString();

        System.out.println(str1);
        System.out.println(str2);
    }

    public static String inputString(){
        while(true){
            String string = sc.next();
            if(string.length() > 20){
                continue;
            }
            return string;
        }
    }
}
