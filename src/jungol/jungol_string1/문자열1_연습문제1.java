package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;

        while(loop){
            char ch = sc.next().charAt(0);
            System.out.printf("%c -> %d\n", ch, (int)ch);
            if(ch == '0'){
                loop = false;
            }
        }

    }
}
