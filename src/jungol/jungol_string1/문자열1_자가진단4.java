package jungol.jungol_string1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 문자열1_자가진단4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = inputString();
        int n = inputN();

        printString(str, n);
    }

    public static String inputString(){
        while(true){
            try{
                String string = sc.next();
                if(string.length() > 100){
                    continue;
                }
                return string;
            }catch (InputMismatchException e){
                System.out.println("올바르게 입력해주세요.");
            }
        }
    }

    public static int inputN(){
        while(true){
            try{
                int n = sc.nextInt();;
                if(n < 1 || n > 200){
                    continue;
                }
                return n;
            }catch (InputMismatchException e){
                System.out.println("올바르게 입력해주세요.");
            }
        }
    }

    public static void printString(String s, int n){
        if(n > s.length()){
            for(int i = s.length() - 1 ; i >= 0 ; i--){
                System.out.print(s.charAt(i));
            }
            return;
        }
        for(int i = s.length() - 1 ; i >= s.length()-n ; i--){
            System.out.print(s.charAt(i));
        }
    }
}
