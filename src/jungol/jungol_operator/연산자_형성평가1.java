package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int mat = sc.nextInt();
        int com = sc.nextInt();

        int total = kor + eng + mat + com;
        double avg = total / 4.0;
        System.out.printf("sum %d\navg %d", total, (int)avg);
    }
}
