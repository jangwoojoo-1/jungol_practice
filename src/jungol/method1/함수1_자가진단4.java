package jungol.method1;

import java.util.Scanner;

public class 함수1_자가진단4 {
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
                findMax(nums);
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

    public static void findMax(String[] num){
        int n1 = Integer.parseInt(num[0]);
        int n2 = Integer.parseInt(num[1]);
        int n3 = Integer.parseInt(num[2]);
        int max1 = Math.max(n1, n2);
        int max2 = Math.max(n1, n3);
        System.out.println(Math.max(max1,max2));
    }
}
