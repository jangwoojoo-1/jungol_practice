package jungol.jungol_array1;

import java.time.LocalDate;
import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //평년 윤년 베열 선언
        int[] common_year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leap_year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //평년 윤년 구분 변수
        int n = 0;

        while(true){
            //년도, 달 입력받기
            System.out.print("YEAR = ");
            int year = sc.nextInt();
            System.out.print("MONTH = ");
            int month = sc.nextInt();

            // 예외 처리
            if(month == 0){
                break;
            } else if((month > 12 || month < 0) || year < 0){
                System.out.println("잘못 입력하였습니다.\n");
                continue;
            } else {

                LocalDate localDate = LocalDate.of(year, month, 1);
                System.out.printf("입력하신 달의 날의 수는 %d일입니다.\n", localDate.lengthOfMonth());

                //평년 윤년 계산
                if (year%400 == 0 && year%4 == 0){
                    n = 1;
                } else {
                    n = 0;
                }

                if (n == 1){
                    System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n", leap_year[month-1]);
                } else {
                    System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n", common_year[month-1]);
                }
            }
        }
    }
}
