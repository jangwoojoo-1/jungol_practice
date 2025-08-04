package jungol.method1;

import java.util.Arrays;
import java.util.Scanner;

public class 함수1_연습문제6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        while (true){
            String str = sc.nextLine();
            try{
                String[] nums = strSplit(str);
                if(nums.length != 3) {
                    continue;
                }

                calculateOp(nums);
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

    public static void calculateOp(String[] num){
        int n1 = Integer.parseInt(num[0]);
        String op = num[1];
        int n2 = Integer.parseInt(num[2]);

        switch (op){
            case "+":
                System.out.printf("%d + %d = %d \n", n1, n2, n1+n2);
                break;
            case "-":
                System.out.printf("%d - %d = %d \n", n1, n2, n1-n2);
                break;
            case "*":
                System.out.printf("%d * %d = %d \n", n1, n2, n1*n2);
                break;
            case "/":
                System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
                break;
            default:
                System.out.printf("%d %s %d = 0", n1, op, n2);

        }
    }
}
