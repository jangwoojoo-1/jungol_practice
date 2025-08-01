package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(string.charAt(i));
        }
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 100 || string.length() < 5){
                continue;
            }
            return string;
        }
    }
}
