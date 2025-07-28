package jungol.jungol_loop1;

import java.util.Scanner;

public class 반복제어문1_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num < 0 && num > 100){
            System.out.println("100 이하의 양의 정수만 입력하세요.");
            num = sc.nextInt();
        }

        int sum = 0, i = 1;
        while(i <= num){
            sum += i;
            i++;
        }

        System.out.println(sum);

    }
}
