package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Y_N = "";
        boolean flag = true;

        try{
            while(flag){
                int base = sc.nextInt();
                int height = sc.nextInt();

                System.out.printf("Base = %d\n", base);
                System.out.printf("Height = %d\n", height);
                System.out.printf("Triangle width = %.1f\n", (double)base*height/2);

                System.out.print("Continue? ");
                //sc.nextLine();// 버퍼 개행문자 \n 지우기
                Y_N = sc.next();
                if(Y_N.equals("Y") || Y_N.equals("y")){
                    continue;
                } else {
                    break;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
