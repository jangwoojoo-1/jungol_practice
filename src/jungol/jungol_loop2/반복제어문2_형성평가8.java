package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                System.out.printf("%d ", i*j);
            }
            System.out.println();
        }
    }
}
