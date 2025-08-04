package jungol.method1;

import java.util.Arrays;
import java.util.Scanner;

public class 함수1_연습문제5 {
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

                int[] scores = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();

                boolean isValid = Arrays.stream(scores).allMatch(n -> n >= 0 && n <= 100);

                if (!isValid) {
                    System.out.println("각 점수는 0 이상 100 이하이어야 합니다.");
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
