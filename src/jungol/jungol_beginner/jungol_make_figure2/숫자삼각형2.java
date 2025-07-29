package jungol.jungol_beginner.jungol_make_figure2;

import java.util.Scanner;

public class 숫자삼각형2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;

        if(n >=1 && n <= 50 && n%2==1){
            for (int i = n ; i >= 1 ; i--){
                for(int j = i ; j < n ; j++){
                    System.out.print("  ");
                }
                for(int s = 1 ; s <= i*2-1 ; s++){
                    System.out.print(num + " ");
                }
                num ++;
                System.out.println();
            }
        } else {
            System.out.println("INPUT ERROR!");
        }
    }
}
