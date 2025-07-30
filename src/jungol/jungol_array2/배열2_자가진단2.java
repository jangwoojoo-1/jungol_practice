package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_count = new int[10];

        while(true){
            int n = sc.nextInt();
            if(n > 0 && n <= 100){
                num_count[n/10]++;
            } else if (n == 0){
                break;
            } else {
                System.out.println("100 미만의 양의 정수를 입력하세요.");
                n = sc.nextInt();
            }
        }

        for (int i = 0; i < num_count.length; i++) {
            if(num_count[i] != 0){
                System.out.printf("%d : %d\n", i, num_count[i]);
            } else {
                continue;
            }

        }
    }
}
