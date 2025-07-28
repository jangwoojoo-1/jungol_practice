package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            char grade = sc.nextLine().charAt(0);
            grade = Character.toUpperCase(grade);

            if(grade == 'A'){
                System.out.println("Excellent");
            } else if (grade == 'B') {
                System.out.println("Good");
            } else if (grade == 'C') {
                System.out.println("Usually");
            } else if (grade == 'D') {
                System.out.println("Effort");
            } else if (grade == 'F') {
                System.out.println("Failure");
            } else {
                System.out.println("error");
            }
        } catch(InputMismatchException e){
            System.out.println("ABCDF만 입력해주세요.");
        }
    }
}
