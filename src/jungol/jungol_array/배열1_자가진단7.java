package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_자가진단7 {
    public static void main(String[] args) {
        int[] num_array = new int[10];
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int min = 10000;
        int max= 0;

        for(int i = 0 ; i < 10 ; i++){
            num = sc.nextInt();
            while(num < 1 && num >= 10000){
                System.out.println("1 이상 10000 미만의 정수를 입력하세요. ");
                num = sc.nextInt();
            }
            num_array[i] = num;
        }

        for (int i = 0 ; i < 10 ; i++){
            if(num_array[i]>100 && num_array[i]<min){
                min = num_array[i];
            } else if (num_array[i]<100 && num_array[i] > max){
                max = num_array[i];
            } else {
                continue;
            }
        }
        if(min == 10000){
            min = 100;
        }
        if(max == 0){
            max = 100;
        }

        System.out.printf("%d %d", max, min);
    }
}
