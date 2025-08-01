package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] strs = new String[5];
        for(int i = 0 ; i < strs.length ; i++){
            strs[i] = inputString();
        }
        for (String str : strs) {
            System.out.println(str);
        }
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() >= 20){
                continue;
            }
            return string;
        }
    }

}
