package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        String[] strs = string.split(" ");

        for (int i = 0; i < strs.length; i++) {
            if(i%2 == 0) System.out.println(strs[i]);
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
