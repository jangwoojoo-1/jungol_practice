package jungol.jungol_input;

import java.util.Scanner;

public class 입력_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("yard? ");
        double yard = sc.nextDouble();
        double yard_to_cm = yard*91.44;
        System.out.printf("%.1fyard = %.1fcm", yard, yard_to_cm);
    }
}
