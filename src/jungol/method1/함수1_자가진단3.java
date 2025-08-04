package jungol.method1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 함수1_자가진단3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = inputInt();
        printSquare(n);
    }

    public static int inputInt(){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine());
                if(n <= 0 || n > 100) continue;
                return n;
            }catch (InputMismatchException e){
                System.out.println("정수를 입력해주세요.");
                sc.next();
            }
        }
    }

    public static void printSquare(int n){
        int count = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++ ){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
