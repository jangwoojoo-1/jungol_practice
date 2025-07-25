package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        double time = 0.0;
        for(int i = 0; i<5;i++){
            int num = sc.nextInt();
            total += num;
            time++;
        }
        System.out.printf("총점 : %d\n평균 : %.1f", total, total/time);
    }
}
