package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_자가진단2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        System.out.printf("%s%s", string,string);
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
