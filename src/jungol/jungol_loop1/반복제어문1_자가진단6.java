package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        try{
            while(num >= 1 && num <= 4){
                System.out.print("1. Korea\n2. USA \n3. Japan\n4. China\n number? ");
                num = sc.nextInt();

                switch(num){
                    case 1:
                        System.out.println("\nSeoul\n");
                        break;
                    case 2:
                        System.out.println("\nWashington\n");
                        break;
                    case 3:
                        System.out.println("\nTokyo\n");
                        break;
                    case 4:
                        System.out.println("\nBeijing\n");
                        break;
                    default:
                        System.out.println("\nnone");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
