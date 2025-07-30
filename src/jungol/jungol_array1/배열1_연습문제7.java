package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Scanner;


public class 배열1_연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] num_array = new Integer[10];

        for(int i = 0 ; i < num_array.length ; i++){
            int num = sc.nextInt();
            while(num >= 10000 && num <= -10000){
                System.out.println("4자리 이하의 정수를 입력하세요. ");
                num = sc.nextInt();
            }
            num_array[i] = num;
        }

        Arrays.sort(num_array);

        int maxIndex = 9;
        int minIndex = 0;

        int maxEven = num_array[maxIndex];
        int minOdd = num_array[minIndex];

        while(Math.abs(maxEven)%2 != 0){
            maxIndex--;
            maxEven = num_array[maxIndex];
        }

        while (Math.abs(maxEven)%2 != 1){
            minIndex++;
            minOdd = num_array[minIndex];
        }

        System.out.printf("%d %d", minOdd, maxEven);
    }
}
