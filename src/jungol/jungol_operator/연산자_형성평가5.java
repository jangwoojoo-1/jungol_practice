package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minsu_height = sc.nextInt();
        int minsu_weight = sc.nextInt();
        int kiyung_height = sc.nextInt();
        int kiyung_weight = sc.nextInt();

        System.out.printf("%b", minsu_height > kiyung_height && minsu_weight > kiyung_weight);

    }
}
