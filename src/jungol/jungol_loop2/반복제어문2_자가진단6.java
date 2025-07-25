package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n 입력 받는 경우
        int total = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            int num = sc.nextInt();
            total += num;
        }

        double avg = (double)total / n;

        if(avg >= 80){
            System.out.printf("avg : %.1f\npass", avg);
        } else {
            System.out.printf("avg : %.1f\nfail", avg);
        }
    }
}
