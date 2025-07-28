package jungol.jungol_loop3;

import java.util.Scanner;

public class 반복제어문3_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first_num = 1;
        int a_ascii = 65;

        for (int i = 1 ; i <= n ; i++){
            for (int z = n+1-i ; z >= 1 ; z--){
                System.out.printf("%d ", first_num);
                first_num++;
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.printf("%c ", a_ascii);
                a_ascii++;
            }
            System.out.println();
        }
    }
}
