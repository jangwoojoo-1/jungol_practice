package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_연습문제8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        splitString(string);
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 100){
                continue;
            }
            return string;
        }
    }

    public static void splitString(String s) {
        String[] strings = s.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
