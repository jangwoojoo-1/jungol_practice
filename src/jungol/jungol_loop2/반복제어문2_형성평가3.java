package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int total = 0;
        for (int i = 1; i<=num1 ; i++){
            if((i%5) == 0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
