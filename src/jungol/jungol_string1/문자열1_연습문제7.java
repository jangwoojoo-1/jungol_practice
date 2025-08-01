package jungol.jungol_string1;

import java.util.Scanner;

import static java.lang.Character.*;

public class 문자열1_연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        tranferLU(string);
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

    public static void tranferLU(String s){
        for (int i = 0 ; i < s.length() ; i++){
            //System.out.print(isUpperCase(s.charAt(i)) ? toLowerCase(s.charAt(i)) : toUpperCase(s.charAt(i)));
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
                System.out.print(Character.toLowerCase(c));
                continue;
            }
            if(c >= 97 && c <= 122){
                System.out.print(Character.toUpperCase(c));
                continue;
            }
            System.out.print(c);
        }
    }
}
