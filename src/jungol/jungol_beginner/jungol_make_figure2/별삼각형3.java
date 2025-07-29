package jungol.jungol_beginner.jungol_make_figure2;

import java.util.Scanner;

public class 별삼각형3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        if(height%2 == 1 && height > 0){
            for(int i = 1 ; i <= height/2+1 ; i++){
                for(int j = 1 ; j < i ; j++){
                    System.out.print(" ");
                }
                for(int s = 1 ; s <= i*2-1 ; s++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 1 ; i <= height/2 ; i++){
                for(int j = i+1 ; j <= height/2 ; j++){
                    System.out.print(" ");
                }
                for(int s = (height/2-i+1)*2-1 ; s >=1 ; s--){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("INPUT ERROR!");
        }
    }
}
