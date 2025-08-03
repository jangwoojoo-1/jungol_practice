package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = new String[5];
        for(int i = 0 ; i < words.length ; i++){
            words[i] = inputString();
        }

        String ch = inputChar();
        String s = inputString();

        selectWords(words, s, ch);
    }

    public static String inputChar(){
        while(true){
            //System.out.print("문자를 입력하세요. ");
            String string = sc.next();
            if(string.length() > 1){
                continue;
            }
            return string;
        }
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() > 100){
                continue;
            }
            return string;
        }
    }

    public static void selectWords(String[] ss, String s, String c){
        int count = 0;
        for (String string : ss) {
            if(string.contains(c) || string.contains(s)){
                System.out.println(string);
                count++;
            }
        }
        if(count == 0){
            System.out.println("none");
        }
        System.out.println();
    }
}
