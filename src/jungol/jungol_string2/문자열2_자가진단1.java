package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] strs = new String[5];
        for(int i = 0 ; i < strs.length ; i++){
            strs[i] = inputString();
        }
        for (int i = strs.length -1 ; i >= 0 ; i--) {
            System.out.println(strs[i]);
        }
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 30){
                continue;
            }
            return string;
        }
    }

}
