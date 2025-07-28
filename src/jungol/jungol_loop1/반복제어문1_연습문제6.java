package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try{
            while(num != 4){
                System.out.print("1. 입력하기 \n2. 출력하기 \n3. 삭제하기 \n4. 끝내기 \n작업할 번호를 선택하세요. ");
                num = sc.nextInt();

                switch(num){
                    case 1:
                        System.out.println("\n입력하기를 선택하였습니다.\n");
                        break;
                    case 2:
                        System.out.println("\n출력하기를 선택하였습니다.\n");
                        break;
                    case 3:
                        System.out.println("\n삭제하기를 선택하였습니다.\n");
                        break;
                    case 4:
                        System.out.println("\n끝내기를 선택하였습니다.");
                        break;
                    default:
                        System.out.println("\n잘못 입력하였습니다.\n");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
