package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = null;
        while(true){
            string = sc.nextLine();
            if(string.length() <= 100){

            }
        }
        for (int i = 0 ; i < string.length() ; i++){
            char c = string.charAt(i);
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
