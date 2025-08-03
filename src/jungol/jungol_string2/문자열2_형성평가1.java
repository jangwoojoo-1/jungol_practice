package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = inputString();

        String[] words = str.split(" ");

        for (int i = words.length-1 ; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 100){
                continue;
            }
            return string;
        }
    }
}
