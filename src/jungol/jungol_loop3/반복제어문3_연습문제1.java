package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int last_num = 1;

        try{
            /*for(int i = 1 ; i <= num ; i++){
                if(num >= sum){
                    sum += i;
                    last_num = i;
                } else {
                    break;
                }
            }

            System.out.printf("%d %d", last_num, sum);*/

            while(last_num <= num){
                sum += last_num;
                if (sum > num){
                    break;
                }
                last_num++;
            }

            System.out.printf("%d %d", last_num, sum);

        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }

    }
}
