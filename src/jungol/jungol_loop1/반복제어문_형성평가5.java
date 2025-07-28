package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Y_N = 'y';

        try{
            while(Y_N == 'y' || Y_N == 'Y'){
                int base = sc.nextInt();
                int height = sc.nextInt();

                System.out.printf("Base = %d\n", base);
                System.out.printf("Height = %d\n", height);
                System.out.printf("Triangle width = %.1f\n", (double)base*height/2);

                System.out.print("Continue? ");
                Y_N = sc.next().charAt(0);
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
