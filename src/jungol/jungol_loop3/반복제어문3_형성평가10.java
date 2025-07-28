package jungol.jungol_loop3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first_num = 1;

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1; j <= n ; j++){
                System.out.printf("%d ", first_num);
                first_num = (first_num+2)%10;
            }
            System.out.println();
        }
    }
}
