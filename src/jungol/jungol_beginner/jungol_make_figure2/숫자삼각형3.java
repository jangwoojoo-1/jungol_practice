package jungol.jungol_beginner.jungol_make_figure2;

import java.util.Scanner;

public class 숫자삼각형3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >=1 && n <= 50 && n%2==1){
            for (int i = 1 ; i <= n/2 ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
             for (int i = n/2+1 ; i >= 1 ; i--){
                 for (int j = 1 ; j <= i ; j++){
                     System.out.print(j + " ");
                 }
                 System.out.println();
             }

        } else {
            System.out.println("INPUT ERROR!");
        }
    }
}
