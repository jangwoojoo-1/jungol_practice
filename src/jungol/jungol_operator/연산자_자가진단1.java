package jungol.jungol_operator;
import java.util.Scanner;

public class 연산자_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        System.out.printf("sum : %d\navg : %d", sum, avg);
    }
}
