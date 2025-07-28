package jungol.select;

import java.util.Scanner;

public class 선택제어문_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 80){
            System.out.println("축하합니다. 합격입니다.");
        } else {
            System.out.println("불합격입니다. 다음에 다시 도전하세요,");
        }
    }
}
