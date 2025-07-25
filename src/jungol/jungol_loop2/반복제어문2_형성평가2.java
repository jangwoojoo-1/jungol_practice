package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while ((num1 > 100) || (num2 > 100)){
            System.out.println("100 이하의 두 개의 정수를 입력하세요. ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        if(num1 > num2){
            for (int i = num2 ; i<=num1 ; i++) {
                System.out.printf("%d ", i);
            }
        } else if (num2 > num1){
            for (int i = num1 ; i<=num2 ; i++) {
                System.out.printf("%d ", i);
            }
        } else{
            System.out.println("같은 수입니다.");
        }
    }
}
