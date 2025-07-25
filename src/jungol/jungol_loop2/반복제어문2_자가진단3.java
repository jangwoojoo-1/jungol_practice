package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while (num1 > 50){
            System.out.println("50 이하로 다시 입력하세요.");
            num1 = sc.nextInt();
        }

        for(int i = 1; i<=num1;i++){
            if((i%2)==0){
                System.out.printf("%d ", i);
            }
        }
    }
}
