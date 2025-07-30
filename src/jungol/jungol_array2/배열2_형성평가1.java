package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] dice = new int[6];

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            while(n>6 || n < 1){
                n = sc.nextInt();
            }

            dice[n-1]++;
        }
        for(int i = 0 ; i < dice.length ; i++){
            System.out.printf("%d : %d\n", i+1, dice[i]);
        }
    }
}
