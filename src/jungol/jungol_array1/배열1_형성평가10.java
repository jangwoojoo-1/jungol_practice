package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 20){
            n = sc.nextInt();
        }

        int[] scores = new int[n];

        for (int i = 0 ; i < n ; i++){
            scores[i] = sc.nextInt();
        }

        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0 ; j < n-1-i ; j++){
                if (scores[j] < scores[j+1]){
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                } else {
                    continue;
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(scores[i]);
        }
    }
}
