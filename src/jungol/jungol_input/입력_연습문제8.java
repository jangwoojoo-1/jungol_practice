package jungol.jungol_input;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요. ");
        int height = sc.nextInt();
        System.out.print("몸무게를 입력하세요. ");
        double weight = sc.nextDouble();
        System.out.print("이름을 입력하세요. ");
        String name = sc.next();
        System.out.printf("키 = %d\n몸무게 = %.1f\n이름 = %s", height, weight, name);
    }
}
