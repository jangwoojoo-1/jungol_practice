package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

<<<<<<< HEAD
        for (int i = 1 ; i <= col ; i++){
=======
        for(int i = 1 ; i <= col ; i++){
>>>>>>> 01ff5d311cf8f1b4ab95cbddca5b35ebc32d98af
            for(int j = 1 ; j <= row ; j++){
                System.out.printf("%d ", i*j);
            }
            System.out.println();
        }
    }
}
