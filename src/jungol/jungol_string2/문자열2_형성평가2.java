package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};
        char ch = inputChar();
        selectWords(words, ch);
    }

    public static char inputChar(){
        while(true){
            //System.out.print("문자를 입력하세요. ");
            String ch = sc.nextLine();
            if(ch.length() > 1){
                continue;
            }
            return ch.charAt(0);
        }
    }

    public static void selectWords(String[] s, char c){
        int count = 0;
        for (String string : s) {
            if(string.charAt(1) == c || string.charAt(2) == c){
                System.out.println(string);
                count++;
            }
        }
        System.out.println(count);
    }
}
