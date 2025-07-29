package jungol.jungol_beginner.jungol_make_figure2;

import java.util.Scanner;

public class 숫자삼각형1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        if(n >=1 && n <= 50){
            for (int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    if(i%2 == 1){
                        System.out.printf("%-4d", num+j-1);
                    } else {
                        System.out.printf("%-4d", num+i-j);
                    }
                }
                num += i;
                System.out.println();
            }
        } else {
            System.out.println("INPUT ERROR!");
        }
    }
}
