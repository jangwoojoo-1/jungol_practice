package jungol.method1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 함수1_연습문제4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        while (true){
            String str = sc.nextLine();
            try{
                String[] nums = strSplit(str);
                if(nums.length != 2){
                    continue;
                }
                calculateSM(nums);
                break;
            } catch (NumberFormatException e){
                System.out.println("정수를 입력하세요.");
            }
        }
    }

    public static String[] strSplit(String str){
        String[] nums = str.split(" ");
        return nums;
    }

    public static void calculateSM(String[] num){
        int n1 = Integer.parseInt(num[0]);
        int n2 = Integer.parseInt(num[1]);
        System.out.println("두 수의 합 = " + (n1+n2));
        System.out.println("두 수의 차 = " + Math.abs((n1-n2)));
    }
}
