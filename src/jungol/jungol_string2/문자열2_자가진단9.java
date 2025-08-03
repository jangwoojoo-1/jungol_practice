package jungol.jungol_string2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 문자열2_자가진단9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = new String[5];

        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < words.length; i++) {
            words[i] = inputString();
        }

        Arrays.sort(words, Collections.reverseOrder());

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() >= 20){
                continue;
            }
            return string;
        }
    }

}
