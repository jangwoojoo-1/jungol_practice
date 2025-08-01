package jungol.jungol_string1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열1_자가진단5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = inputString();
        String str2 = inputString();

        System.out.print(str1.length()+str2.length());
    }

    public static String inputString(){
        while(true){
            try{
                String string = sc.next();
                if(string.length() >= 20){
                    continue;
                }
                return string;
            }catch (InputMismatchException e){
                System.out.println("올바르게 입력해주세요.");
            }
        }
    }
}
