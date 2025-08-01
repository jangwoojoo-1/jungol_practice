package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = new String[10];

        for(int i = 0 ; i < 10 ; i++){
            words[i] = inputString();
        }
        char ch = inputChar();

        selectWords(words, ch);
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 20){
                continue;
            }
            return string;
        }
    }

    public static char inputChar(){
        while(true){
           //System.out.print("문자를 입력하세요. ");
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
            if(string.charAt(string.length()-1) == c){
                System.out.println(string);
                count++;
            }
        }
        if(count == 0){
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
