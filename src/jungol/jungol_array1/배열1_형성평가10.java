package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 20){
            n = sc.nextInt();
        }

        Integer[] scores = new Integer[n];

        for (int i = 0 ; i < n ; i++){
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores, Collections.reverseOrder());

        for(int i = 0 ; i < n ; i++){
            System.out.println(scores[i]);
        }
    }
}
