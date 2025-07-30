package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_자가진단3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] num_arr = new Integer[100];
        num_arr[0] = 100;

        int n = sc.nextInt();
        while(n < 0 || n > 100){
            n = sc.nextInt();
        }
        num_arr[1] = n;

    //출력
        System.out.printf("%d %d ", num_arr[0], num_arr[1]);
        for(int i = 0 ; i < num_arr.length - 2 ; i++){
            num_arr[i+2] = num_arr[i] - num_arr[i+1];
            System.out.printf("%d ", num_arr[i+2]);
            if(num_arr[i+2] < 0){
                break;
            }
        }
    }
}
