package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_자가진단6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;

        while(loop){
            char c = sc.next().charAt(0);
            loop = descChar(c);

        }
    }

    public static boolean descChar(char c){
        if(c >= 97 && c <= 122){
            System.out.println(c);
            return true;
        }
        if (c >= 65 && c <= 90) {
            System.out.println(c);
            return true;
        }
        if (c >= 48 && c <=  57) {
            System.out.println((int)c);
            return true;
        }
        return false;
    }
}
