package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char ch1 = inputChar();
        char ch2 = inputChar();

        System.out.printf("%d %d", (int)ch1 + (int)ch2, Math.abs((int)ch1 - (int)ch2));

    }

    public static char inputChar(){
        while(true){
            char ch = sc.next().charAt(0);
            if(ch < 65 || (ch > 90 && ch < 97) || ch > 122){
                continue;
            }
            return ch;
        }
    }
}
