package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = new String[50];
        int count = 0;

        for(int i = 0 ; i < words.length ; i++){
            String str = inputString();
            if(str.equals("0")) break;

            words[i] = str;
            count++;
        }

        printOddWords(count, words);


    }

    public static String inputString(){
        while(true){
            String string = sc.next();
            if(string.length() > 100){
                continue;
            }
            return string;
        }
    }

    public static void printOddWords(int end, String[] s){
        System.out.println(end);
        for (int i = 0; i < end; i++) {
            if(i%2 == 0) System.out.println(s[i]);
        }
    }
}
