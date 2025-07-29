package jungol.jungol_beginner.jungol_make_figure2;

import java.util.Scanner;

public class 별삼각형1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int type = sc.nextInt();

        switch(type){
            case 1:
                for(int i = 1 ; i <= size ; i++){
                    for(int j = 1 ; j <= i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i = 1 ; i <= size ; i++){
                    for(int j = size ; j >= i ; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 1 ; i <= size ; i++){
                    for(int j = 1 ; j <= size-i ; j++){
                        System.out.print(" ");
                    }
                    for(int s = 1 ; s <= i*2-1 ; s++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
