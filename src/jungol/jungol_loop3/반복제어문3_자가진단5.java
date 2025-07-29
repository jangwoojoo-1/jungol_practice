package jungol.jungol_loop3;

import java.util.Scanner;

public class 반복제어문3_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n ; i >= 1 ; i--){
            for(int z = i ; z < n ; z++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i*2-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
