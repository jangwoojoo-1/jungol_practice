package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가9 {
    public static void main(String[] args) {
        int[] num_array = new int[100];
        Scanner sc = new Scanner(System.in);
        int index = 0;

        for(int i = 0 ; i < num_array.length ; i++){
            int n = sc.nextInt();
            if(n == 0){
                index = i;
                break;
            }
            num_array[i] = n;
            index++;
        }

        System.out.println(index);
        for(int i = 0 ; i <= index ; i++){
            if(num_array[i]%2 == 0){
                System.out.printf("%d ", num_array[i]/2);
            } else {
                System.out.printf("%d ", num_array[i]*2);
            }
        }

    }
}
