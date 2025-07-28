package jungol.jungol_loop1;

import java.util.Scanner;

public class 반복제어문1_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1 ; i <= num ; i++){
            System.out.printf("%d ", i);
        }
    }
}
