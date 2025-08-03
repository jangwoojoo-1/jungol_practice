package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = inputString();
        selectWords(s, "c");
        selectWords(s, "ab");
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

    public static void selectWords(String s, String c){
        if(s.contains(c)){
            System.out.print("Yes ");
        } else{
            System.out.print("No ");
        }
    }
}
