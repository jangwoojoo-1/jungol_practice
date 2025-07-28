package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        while(num1 > 9 && num2 > 9 && num1 < 2 && num2 < 2){
            System.out.println("2부터 9까지의 수 중 2개를 입력하세요.");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }


        for (int i = 1 ; i <= 9 ; i++){
            for (int j = num1 ; j >= num2 ; j--){
                System.out.printf("%d * %d = %2d   ", j, i, j*i);
            }
            System.out.println();
        }
    }
}
