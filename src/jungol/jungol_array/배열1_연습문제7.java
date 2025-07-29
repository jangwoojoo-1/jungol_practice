package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_연습문제7 {
    public static void main(String[] args) {
        int[] num_array = new int[10];
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int odd_min = 10001;
        int even_max= -10000;

        for(int i = 0 ; i < 10 ; i++){
            num = sc.nextInt();
            while(num >= 10000 && num <= -10000){
                System.out.println("4자리 이하의 정수를 입력하세요. ");
                num = sc.nextInt();
            }
            num_array[i] = num;
        }

        for (int i = 0 ; i < 10 ; i++){
            if((num_array[i]%2 == 1 || num_array[i]%2 == -1) && num_array[i] < odd_min){
                odd_min = num_array[i];
            } else if (num_array[i]%2 == 0 && num_array[i] > even_max){
                even_max = num_array[i];
            } else {
                continue;
            }
        }

        System.out.printf("%d %d", odd_min, even_max);
    }
}
