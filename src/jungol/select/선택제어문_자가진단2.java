package jungol.select;

import java.util.Scanner;

public class 선택제어문_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();

        int fat_rate = weight + 100 - height;
        System.out.println(fat_rate);
        if (fat_rate > 0){
            System.out.println("Obesity");
        }
    }
}
