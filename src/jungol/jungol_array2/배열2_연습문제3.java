package jungol.jungol_array2;

public class 배열2_연습문제3 {
    public static void main(String[] args) {
        Integer[] fibonacci = new Integer[40];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 0 ; i < fibonacci.length - 2 ; i++){
            fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
        }

        for (int i = 10 ; i <= 40 ; i = i + 10){
            System.out.printf("피보나치 수열 %d항 : %d\n", i, fibonacci[i-1]);
        }

    }
}
