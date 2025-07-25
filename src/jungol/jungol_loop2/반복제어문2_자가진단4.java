package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while(num1 > 100){
            System.out.println("100이하의 정수를 입력해주세요.");
            num1 = sc.nextInt();
        }

        int total = 0;
        for (int i = num1 ; i<=100;i++){
            total = total + i;
        }

        System.out.println(total);
    }
}
