package jungol.method1;

import java.util.Scanner;

public class 함수1_자가진단6 {
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

        if(op.equals("+")){
            System.out.printf("%d + %d = %d \n", n1, n2, n1+n2);
        }else if(op.equals("-")){
            System.out.printf("%d - %d = %d \n", n1, n2, n1-n2);
        } else if (op.equals("*")) {
            System.out.printf("%d * %d = %d \n", n1, n2, n1*n2);
        } else if (op.equals("/")) {
            System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
        } else {
            System.out.printf("%d %s %d = 0", n1, op, n2);
        }
    }
}
