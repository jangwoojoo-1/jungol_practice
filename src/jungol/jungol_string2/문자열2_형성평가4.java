package jungol.jungol_string2;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열2_형성평가4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = makeStrArray();

        printStrs(words);
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

    public static String[] makeStrArray(){
        while(true){
            try{
                int n = sc.nextInt();
                //System.out.println("크기 n이 입력되었습니다.");
                String[] strs = new String[n];
                return strs;
            }catch (InputMismatchException e){
                System.out.println("입력이 잘못됐습니다.");
                sc.next();
            }
        }
    }

    public static void printStrs(String[] strs) {
        for(int i = 0 ; i < strs.length ; i++){
            strs[i] = inputString();
        }
        Arrays.sort(strs);

        for (String str : strs) {
            System.out.println(str);
        }
    }

}
