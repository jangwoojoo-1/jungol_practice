package jungol.jungol_string1;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

public class 문자열1_자가진단7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        tranferUpperPrint(string);
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

    public static void tranferUpperPrint(String s){
        for (int i = 0 ; i < s.length() ; i++){
            System.out.print(((s.charAt(i) >= 97 && s.charAt(i) <= 122)||(s.charAt(i) >= 65 && s.charAt(i) <= 90)) ?
                    (isUpperCase(s.charAt(i)) ? s.charAt(i) : toUpperCase(s.charAt(i))) : "");
        }
    }
}
