package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i++){
            System.out.printf("%d ", i*num);
        }
    }
}
