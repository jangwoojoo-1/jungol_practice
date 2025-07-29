package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 1;

        try{
            while(num > 100 || num < 1){
                System.out.print("1부터 100까지의 정수 중 한 개를 입력하세요. ");
                num = sc.nextInt();
            }

            /*for(int i = 1 ; i <= 9 ; i++){
                if((num*i)%10 != 0){
                    System.out.printf("%d ", num*i);
                } else {
                    break;
                }
            }*/

            while(true){
                System.out.printf("%d ", num*i);
                if((num*i)%10 == 0){
                    break;
                }
                i++;
            }

        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
