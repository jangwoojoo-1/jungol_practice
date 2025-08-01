package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = inputString();
        String str2 = inputString();

        printStrs(str1, str2);
    }

    public static String inputString(){
        while(true){
            String string = sc.next();
            if(string.length() > 49){
                continue;
            }
            return string;
        }
    }

    public static void printStrs(String s1, String s2){
        System.out.print((s1.length() >= s2.length()) ?
                ((s1.length() > s2.length()) ? s2+"\n"+s1 : s1+"\n"+s2 ) : s1+"\n"+s2);
    }
}
