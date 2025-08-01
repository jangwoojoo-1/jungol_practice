package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"};
        String ch = inputChar();
        selectWords(words, ch);
        String s = inputString();
        selectWords(words, s);
    }

    public static String inputChar(){
        while(true){
            System.out.print("문자를 입력하세요. ");
            String string = sc.nextLine();
            if(string.length() > 1){
                continue;
            }
            return string;
        }
    }

    public static String inputString(){
        while(true){
            System.out.print("문자를 입력하세요. ");
            String string = sc.next();
            if(string.length() > 20){
                continue;
            }
            return string;
        }
    }

    public static void selectWords(String[] s, String c){
        int count = 0;
        for (String string : s) {
            if(string.contains(c)){
                System.out.println(string);
                count++;
            }
        }
        if(count == 0){
            System.out.println("찾는 단어가 없습니다.");
        }
        System.out.println();
    }
}
