package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"champion", "tel", "pencil", "olympiad", "class",
                "information", "jungol", "lesson", "book", "lion", "l"};
        char ch = inputChar();
        selectWords(words, ch);
    }

    public static char inputChar(){
        while(true){
            System.out.print("문자를 입력하세요. ");
            String string = sc.nextLine();
            if(string.length() > 1){
                continue;
            }
            return string.charAt(0);
        }
    }

    public static void selectWords(String[] s, char c){
        int count = 0;
        for (String string : s) {
            if(string.charAt(0) == c){
                System.out.println(string);
                count++;
            }
        }
        if(count == 0){
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
