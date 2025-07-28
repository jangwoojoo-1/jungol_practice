package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String message = sc.nextLine();
            char gender = Character.toUpperCase(message.charAt(0));
            int age = Integer.parseInt(message.substring(2));

            if (gender == 'F' && age >= 18){
                System.out.println("WOMAN");
            } else if (gender == 'F' && age >= 0){
                System.out.println("GIRL");
            } else if (gender == 'M' && age >= 18){
                System.out.println("MAN");
            } else if (gender == 'F' && age >= 0){
                System.out.println("BOY");
            } else {
                System.out.println("올바르게 입력해주세요. (예-M 19)");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
