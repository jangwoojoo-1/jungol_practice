package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int score = 0;
            while(score <= 100 && score >= 0){
                System.out.print("점수를 입력하세요. ");
                score = sc.nextInt();
                if (score <= 100 && score >= 80) {
                    System.out.println("축하합니다. 합격입니다.");
                } else if (score < 80 && score >= 0){
                    System.out.println("죄송합니다. 불합격입니다.");
                } else {
                    continue;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
