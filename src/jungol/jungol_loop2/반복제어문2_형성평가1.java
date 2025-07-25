package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>10){
            System.out.println("10이하의 자연수를 입력해주세요.");
            n = sc.nextInt();
        }

        for(int i = 0 ; i < 4 ; i++){
            System.out.println("JUNGOL");
        }
    }
}
