package jungol.method1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 함수1_연습문제3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printStars();
    }

    public static int inputInt(){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine());
                if(n <= 0) continue;
                return n;
            }catch (InputMismatchException e){
                System.out.println("정수를 입력해주세요.");
                sc.next();
            }
        }
    }

    public static void printStars(){
        int n = inputInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
