package jungol.method1;

import java.util.Arrays;
import java.util.Scanner;

public class 함수1_자가진단5 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        while (true){
            String str = sc.nextLine();
            try{
                String[] nums = strSplit(str);
                if(nums.length != 2) {
                    continue;
                }

                int[] scores = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();

                boolean isValid = Arrays.stream(scores).allMatch(n -> n <= 10);

                if (!isValid) {
                    System.out.println("각 정수는 10 이하이어야 합니다.");
                    continue;
                }

                calculatePow(nums);
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

    public static void calculatePow(String[] num){
        int n1 = Integer.parseInt(num[0]);
        int n2 = Integer.parseInt(num[1]);

        System.out.print((int)Math.pow(n1, n2));
    }
}
