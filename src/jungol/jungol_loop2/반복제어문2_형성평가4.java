package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>=100){
            System.out.println("100이하의 자연수를 입력하세요. ");
            n = sc.nextInt();
        }

        int total = 0;
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt();
            total += num;
        }

        System.out.printf("%.2f", (double)total/n);
    }
}
