package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        String[] strs = string.split(" ");

        for (String str : strs) {
            System.out.println(str);
        }
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 49){
                continue;
            }
            return string;
        }
    }

}
